package list.shopping.web.service;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.util.UriUtils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.csv.*;

import list.shopping.web.entity.Product;
import list.shopping.web.model.CsvProductModel;
import list.shopping.web.repository.ProductRepository;
import lombok.val;

@Service
public class FileService {
    @Autowired
    private ProductRepository productRepository;

    private static final String CONTENT_DISPOSITION_FORMAT = "attachment; filename=\"%s\"; filename*=UTF-8''%s";
    private static CsvMapper csvMapper = new CsvMapper();
    private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

    /**
     * Csvファイルを返却する
     *
     * @return
     * @throws UnsupportedEncodingException
     * @throws JsonProcessingException
     */
    public ResponseEntity<byte[]> getCsvFile() throws UnsupportedEncodingException, JsonProcessingException {
        val httpHeaders = new HttpHeaders();
        val date = simpleDateFormat.format(new Date());
        val fileName = "ShoppingList-" + date + ".csv";
        addContentDisposition(httpHeaders, fileName);
        return new ResponseEntity<>(getCsvText().getBytes("MS932"), httpHeaders, HttpStatus.OK);
    }

    /**
     * ファイル名を日本語対応させる
     *
     * @param headers
     * @param fileName
     * @throws UnsupportedEncodingException
     */
    private void addContentDisposition(HttpHeaders headers, String fileName)
            throws UnsupportedEncodingException {
        val headerValue = String.format(CONTENT_DISPOSITION_FORMAT,
                fileName, UriUtils.encode(fileName, StandardCharsets.UTF_8.name()));
        headers.add(HttpHeaders.CONTENT_DISPOSITION, headerValue);
    }

    /**
     * Csvファイルのテキストを取得する
     *
     * @return
     * @throws JsonProcessingException
     */
    private String getCsvText() throws JsonProcessingException {
        //文字列にダブルクオートをつける
        csvMapper.configure(CsvGenerator.Feature.ALWAYS_QUOTE_STRINGS, true);
        //ヘッダをつける
        CsvSchema schema = csvMapper.schemaFor(Product.class).withHeader();
        //メンバーデータをダウンロードするイメージ。本来はDBからデータを取得する。
        val csvProductModelList = new ArrayList<CsvProductModel>();
        val products = productRepository.findAll();
        products.forEach(product -> {
            val csvProductModel = new CsvProductModel();
            csvProductModel.setId(product.getId());
            csvProductModel.setName(product.getName());
            csvProductModel.setStatus(product.getStatus());
            csvProductModel.setCreatedAt(simpleDateFormat.format(product.getCreatedAt()));
            csvProductModel.setUpdatedAt(simpleDateFormat.format(product.getUpdatedAt()));
            csvProductModelList.add(csvProductModel);
        });
        return csvMapper.writer(schema).writeValueAsString(csvProductModelList);
    }

}