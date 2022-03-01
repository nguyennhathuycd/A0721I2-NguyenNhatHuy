package com.codegym.controller;

import com.codegym.service.EmailService;
import com.codegym.service.IEmailService;
import com.codegym.model.Email;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/email")
public class EmailController {
    private IEmailService emailService = new EmailService();

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String showAll(Model model) {
        List<Email> emailList = emailService.showAll();
        model.addAttribute("emails", emailList);
        return "/list";
    }

    @RequestMapping(value = "/{id}/view", method = RequestMethod.GET)
    public String showView(@PathVariable int id, ModelMap model) {
        model.addAttribute("email", emailService.findById(id));
        return "/view";
    }

    @RequestMapping(value = "/{id}/edit", method = RequestMethod.GET)
    public String showEdit(@PathVariable int id, ModelMap model) {
        model.addAttribute("email", emailService.findById(id));
        return "/edit";
    }

    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public String submit(@ModelAttribute("email") Email email, ModelMap model) {
        emailService.update(email);
        model.addAttribute("email", emailService.findById(email.getId()));
        model.addAttribute("msg", "Update email successfully");
        return "/edit";
    }
}
