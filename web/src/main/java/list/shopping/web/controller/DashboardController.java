package list.shopping.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import list.shopping.web.service.*;

@RequestMapping("/dashboard")
@Controller
public class DashboardController {
    @Autowired
    private ProductService productService;

    @Autowired
    private CandidacyService candidacyService;

    /**
     * ダッシュボードページを表示する
     *
     * @param mav
     * @return
     */
    @GetMapping
    public ModelAndView dashboard(ModelAndView mav) {
        mav.addObject("products", productService.selectAll());
        mav.addObject("idList", productService.getIdList());
        mav.setViewName("dashboard/index");
        return mav;
    }

    /**
     * 製品の詳細
     *
     * @param mav
     * @return
     */
    @GetMapping("/{productId}")
    public ModelAndView details(ModelAndView mav, @PathVariable int productId) {
        mav.addObject("product", productService.selectById(productId));
        mav.addObject("candidacies", candidacyService.selectByProductId(productId));
        mav.addObject("candidacyIdList", candidacyService.getIdListByProductId(productId));
        mav.setViewName("dashboard/show");
        return mav;
    }

    /**
     * ダッシュボードに遷移する
     * @return
     */
    @PostMapping
    public String redirectDashBoard() {
        return "redirect:/dashboard";
    }
}