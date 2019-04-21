package list.shopping.web.controller.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import list.shopping.web.entity.Product;
import list.shopping.web.service.ProductService;
import lombok.val;

@RequestMapping("/api/product")
@RestController
public class ApiProductController {
    @Autowired
    private ProductService productService;

    /**
     * Productを登録する
     *
     * @param product
     * @return
     */
    @PostMapping("/create")
    public String recordProduct(@RequestBody @Validated Product product) {
        productService.newSave(product);
        val status = "{status: \"200\"}";
        return status;
    }
}