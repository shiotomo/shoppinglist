package list.shopping.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import list.shopping.web.service.ProductService;

@RequestMapping("/product")
@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/create")
    public String create() {
        return "redirect:/dashboard";
    }
}
