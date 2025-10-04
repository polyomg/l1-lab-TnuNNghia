package poly.edu.lab4.controller;

import jakarta.validation.Valid;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import poly.edu.lab4.entity.Staff;
import poly.edu.lab4.entity.StaffValidation;

@Controller
@RequestMapping("/staff")
public class StaffValidationController {

    @GetMapping("/formvalidation")
    public String createForm(Model model, @ModelAttribute("staff") StaffValidation staff) {
        model.addAttribute("message", "Vui lòng nhập thông tin nhân viên!");
        return "staffvalidation"; // trỏ về staffvalidation.html
    }

    @PostMapping("/savevalidation")
    public String createSave(@Valid @ModelAttribute("staff") StaffValidation staff,
                             Errors errors,
                             Model model) {
        if (errors.hasErrors()) {
            model.addAttribute("message", "Vui lòng nhập thông tin đầy đủ!");
        } else {
            model.addAttribute("message", "Dữ liệu đúng!");
        }
        return "staffvalidation";
    }
}
