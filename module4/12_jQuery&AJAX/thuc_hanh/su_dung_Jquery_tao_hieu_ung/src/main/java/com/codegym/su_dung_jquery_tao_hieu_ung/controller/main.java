package com.codegym.su_dung_jquery_tao_hieu_ung.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class main {
    @GetMapping("")
    public String show() {
        return "index";
    }
}
