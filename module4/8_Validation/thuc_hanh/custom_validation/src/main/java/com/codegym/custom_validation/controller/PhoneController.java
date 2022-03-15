package com.codegym.custom_validation.controller;

import com.codegym.custom_validation.model.Phone;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class PhoneController {
    @GetMapping("/phone")
    public ModelAndView showForm() {
        ModelAndView modelAndView = new ModelAndView("/index");
        modelAndView.addObject("phone", new Phone());
        return modelAndView;
    }

    @PostMapping("/phone")
    public ModelAndView checkValidation(@Valid @ModelAttribute("phone") Phone phone, BindingResult bindingResult) {
        new Phone().validate(phone, bindingResult);
        if (bindingResult.hasFieldErrors()) {
            return new ModelAndView("/index");
        }
        return new ModelAndView("/result");
    }

}
