package com.poly.lab2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ctrl")
public class OkController {
    // Hiển thị form ok.html
    @GetMapping("/ok")
    public String ok(Model model) {
        return "ok"; // trả về view ok.html
    }
    // Xử lý OK1 (POST /ctrl/ok)
    @PostMapping("/ok")
    public String m1(Model model) {
        model.addAttribute("msg", "Bạn vừa gọi m1()");
        return "ok";
    }
    // Xử lý OK2 (GET /ctrl/ok)
    @GetMapping(value = "/ok", params = "!x")
    public String m2(Model model) {
        model.addAttribute("msg", "Bạn vừa gọi m2()");
        return "ok";
    }
    // Xử lý OK3 (GET /ctrl/ok?x)
    @GetMapping(value = "/ok", params = "x")
    public String m3(Model model) {
        model.addAttribute("msg", "Bạn vừa gọi m3()");
        return "ok";
    }
}
