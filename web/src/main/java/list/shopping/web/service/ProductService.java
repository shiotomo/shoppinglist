package list.shopping.web.service;

import java.sql.Timestamp;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import list.shopping.web.entity.Product;
import list.shopping.web.repository.ProductRepository;
import lombok.val;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> selectAll() {
        return productRepository.findAll();
    }

    /**
     * データベースに商品を保存する
     * 状態はすべてnewにする
     *
     * @param product
     */
    public void newSave(Product product) {
        val timestamp = new Timestamp(System.currentTimeMillis());
        product.setStatus("new");
        product.setCreatedAt(timestamp);
        product.setUpdatedAt(timestamp);
        productRepository.save(product);
    }

    /**
     * 商品を更新する
     *
     * @param product
     */
    public void update(Product product) {
        val timestamp = new Timestamp(System.currentTimeMillis());
        product.setUpdatedAt(timestamp);
        productRepository.save(product);
    }

    /**
     * 商品を削除する
     *
     * @param id
     */
    public void delete(int id) {
        productRepository.deleteById(id);
    }

    /**
     * productのIDリストを取得する
     *
     * @return
     */
    public List<Integer> getIdList() {
        val idList = new ArrayList<Integer>();
        val products = productRepository.findAll();
        products.forEach(product -> idList.add(product.getId()));
        return idList;
    }

    /**
     * idからproductを取得する
     *
     * @param id
     * @return
     */
    public Optional<Product> selectById(int id) {
        return productRepository.findById(id);
    }
}
