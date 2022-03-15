package com.codegym.validate_form_dang_ky.controller;

import com.codegym.validate_form_dang_ky.model.User;
import com.codegym.validate_form_dang_ky.service.IUserService;
import com.codegym.validate_form_dang_ky.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class UserController {
    @Autowired
    private IUserService iUserService = new UserService();

    @GetMapping("/sign-up")
    public ModelAndView showForm() {
        ModelAndView modelAndView = new ModelAndView("/signup");
        modelAndView.addObject("user", new User());
        return modelAndView;
    }

    @PostMapping("/sign-up")
    public ModelAndView checkUser(@Valid @ModelAttribute("user") User user, BindingResult bindingResult) {
        new User().validate(user, bindingResult);
        if (bindingResult.hasErrors()) {
            return new ModelAndView("/signup");
        }
        iUserService.createUser(user);
        ModelAndView modelAndView = new ModelAndView("/result");
        modelAndView.addObject("user", user);
        return modelAndView;
    }
}
