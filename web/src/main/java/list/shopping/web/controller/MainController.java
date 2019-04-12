package list.shopping.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/")
@Controller
public class MainController {

    @GetMapping
    public String login() {
        return "redirect:/login";
    }
}
