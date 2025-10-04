package poly.edu.lab4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class WebController {
    @GetMapping({"/", "/home", "/home/index"})
    public String index(Model model) {
        return "home";   // trả home.html (page con), home.html sẽ sử dụng layout fragment
    }

    @GetMapping("/home/about")
    public String about(Model model) {
        return "about";  // trả about.html
    }
}
