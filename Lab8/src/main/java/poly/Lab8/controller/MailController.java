package poly.Lab8.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import poly.Lab8.service.MailService;


@Controller
@RequestMapping("/mail")
public class MailController {

    @Autowired
    private MailService mailService;

    // form page
    @GetMapping("/form")
    public String form(Model model) {
        model.addAttribute("mail", new MailService.Mail());
        return "mail/form";
    }

    // push into queue
    @PostMapping("/send")
    public String sendQueue(@ModelAttribute MailService.Mail mail, Model model) {
        mailService.push(mail);
        model.addAttribute("message", "Mail của bạn đã được xếp vào hàng đợi");
        return "mail/result";
    }

    // send immediately (sync) - for demo
    @PostMapping("/sendNow")
    public String sendNow(@ModelAttribute MailService.Mail mail, Model model) {
        try {
            mailService.send(mail);
            model.addAttribute("message", "Mail đã được gửi ngay");
        } catch (Exception e) {
            model.addAttribute("message", "Lỗi: " + e.getMessage());
        }
        return "mail/result";
    }

    // quick endpoint to push with default content
    @ResponseBody
    @GetMapping("/sendQuick")
    public String sendQuick() {
        mailService.push("receiver@gmail.com", "Subject", "Body");
        return "Mail của bạn đã được xếp vào hàng đợi";
    }
}

