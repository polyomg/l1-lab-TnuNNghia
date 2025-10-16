package poly.Lab6.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import poly.Lab6.dao.ProductDAO;
import poly.Lab6.entity.Product;

import java.util.*;

@Controller
public class ProductController {

    @Autowired
    ProductDAO dao;

    @RequestMapping("/product/sort")
    public String sort(Model model, @RequestParam("field") Optional<String> field) {
        Sort sort = Sort.by(Direction.DESC, field.orElse("price"));
        List<Product> items = dao.findAll(sort);
        model.addAttribute("items", items);
        model.addAttribute("field", field.orElse("price").toUpperCase());
        return "product/sort";
    }

    @RequestMapping("/product/page")
    public String paginate(Model model, @RequestParam("p") Optional<Integer> p) {
        Pageable pageable = PageRequest.of(p.orElse(1), 2);
        Page<Product> page = dao.findAll(pageable);
        model.addAttribute("page", page);
        return "product/page";
    }

}
