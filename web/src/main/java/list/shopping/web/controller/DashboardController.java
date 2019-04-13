package list.shopping.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import list.shopping.web.service.ProductService;

@RequestMapping("/dashboard")
@Controller
public class DashboardController {
    @Autowired
    private ProductService productService;

    /**
     * ダッシュボードページを表示する
     *
     * @param mav
     * @return
     */
    @GetMapping
    public ModelAndView index(ModelAndView mav) {
        mav.setViewName("dashboard/index");
        mav.addObject("products", productService.selectAll());
        return mav;
    }
}