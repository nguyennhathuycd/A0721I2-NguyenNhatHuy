package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SandwichController {

    @GetMapping("")
    public String showList() {
        return "index";
    }

    @PostMapping("/calculator")
    public String result(@RequestParam(required = false, defaultValue = "null") String number1, @RequestParam(required = false, defaultValue = "null") String number2, @RequestParam String action,Model model) {
        if ("null".equals(number1) || "null".equals(number2)) {
            model.addAttribute("result", "Error: Miss number 1 or number 2");
        } else {
            double num1 = Double.parseDouble(number1);
            double num2 = Double.parseDouble(number2);
            double result = 0;
            boolean checkDivZero = false;
            if (action.equals("add")) {
                result = num1 + num2;
            } else if (action.equals("sub")) {
                result = num1 - num2;
            } else if (action.equals("mul")) {
                result = num1 * num2;
            } else {
                if (num2 == 0) {
                    checkDivZero = true;
                } else {
                    result = num1 / num2;
                }
            }

            if (checkDivZero) {
                model.addAttribute("result", "Could not div for 0");
            } else {
                model.addAttribute("result", result);
            }
        }
        return "result";
    }
}
