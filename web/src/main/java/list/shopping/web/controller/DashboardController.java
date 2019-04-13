package list.shopping.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/dashboard")
@Controller
public class DashboardController {

    /**
     * ダッシュボードページを表示する
     *
     * @param mav
     * @return
     */
    @GetMapping
    public ModelAndView index(ModelAndView mav) {
        mav.setViewName("dashboard/index");
        return mav;
    }
}