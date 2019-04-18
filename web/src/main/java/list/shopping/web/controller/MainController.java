package list.shopping.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/")
@Controller
public class MainController {

    /**
     * ログイン画面にリダイレクトする
     *
     * @return
     */
    @GetMapping
    public String index() {
        return "redirect:/login";
    }

    /**
     * ログイン画面を表示する
     *
     * @param mav
     * @return
     */
    @GetMapping("/login")
    public ModelAndView login(ModelAndView mav) {
        mav.setViewName("login");
        return mav;
    }
}
