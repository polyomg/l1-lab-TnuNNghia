package com.poly.lab2;

import com.poly.lab2.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Arrays;
import java.util.List;
@Controller
public class ProductController2 {
    @GetMapping("/product/form4")
    public String form(Model model){
        Product p = new Product();
        p.setName("iPhone 30");
        p.setPrice(5000.0);
        model.addAttribute("product1", p);
        model.addAttribute("product2", new Product());
        return "product/form4";
    }
    @PostMapping("/product/save4")
    public String save(@ModelAttribute("product2") Product p, Model model){
        model.addAttribute(           "product2", p);
        model.addAttribute("product1", new Product("iPhone 30", 5000.0));
        return "product/form4";
    }
    @ModelAttribute("items")
    public List<Product> getItems(){
        return Arrays.asList(
                new Product("A", 1.0),
                new Product("B", 12.0)
        );
    }

}

