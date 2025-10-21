package poly.Lab8.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {

    @GetMapping("/")
    @ResponseBody
    public String home() {
        return "Home page";
    }

    @GetMapping("/admin/home/index")
    @ResponseBody
    public String adminIndex() {
        return "Admin home index (public)";
    }

    @GetMapping("/admin/secret")
    @ResponseBody
    public String adminSecret() {
        return "Admin secret (requires admin)";
    }

    @GetMapping("/account/edit-profile")
    @ResponseBody
    public String editProfile() {
        return "Edit profile (requires login)";
    }

    @GetMapping("/order/list")
    @ResponseBody
    public String orderList() {
        return "Order list (requires login)";
    }
}

