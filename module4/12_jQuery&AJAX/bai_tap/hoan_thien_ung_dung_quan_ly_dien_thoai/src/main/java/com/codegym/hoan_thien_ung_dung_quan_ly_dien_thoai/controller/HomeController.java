package com.codegym.hoan_thien_ung_dung_quan_ly_dien_thoai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String showIndex() {
        return "/index";
    }
}
