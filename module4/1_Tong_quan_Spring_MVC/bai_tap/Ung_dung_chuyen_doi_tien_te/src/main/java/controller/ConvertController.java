package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConvertController {
    private final double RATE = 23000;

    @GetMapping("/convert")
    public String showConvertView() {
        return "index";
    }

    @PostMapping("/convert")
    public String showConvertResult(@RequestParam("usd") double usd, Model model) {
        double vnd = usd * RATE;
        model.addAttribute("vnd", vnd);
        return "index";
    }
}
