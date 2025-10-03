package com.poly.lab2;

import com.poly.lab2.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class ProductController {
    @GetMapping("/product/form3")
    public String form() {
        return "product/form";
    }
    @PostMapping("/product/save3")
    public String save(@ModelAttribute("product") Product product, Model model) {
        // Đưa product ra view
        model.addAttribute("product", product);
        return "product/form";
    }
}
