package list.shopping.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import list.shopping.web.entity.Product;
import list.shopping.web.service.ProductService;

@RequestMapping("/product")
@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    /**
     * 商品を登録する
     *
     * @param product
     * @return
     */
    @PostMapping("/create")
    public String create(@ModelAttribute Product product) {
        productService.newSave(product);
        return "redirect:/dashboard";
    }

    /**
     * 商品を更新する
     *
     * @param product
     * @return
     */
    @PutMapping("/{id}")
    public String update(@ModelAttribute Product product) {
        productService.update(product);
        return "redirect:/dashboard/" + product.getId();
    }

    /**
     * 商品をIDをもとに削除する
     *
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {
        productService.delete(id);
        return "redirect:/dashboard";
    }
}
