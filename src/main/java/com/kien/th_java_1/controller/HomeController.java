package com.kien.th_java_1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String hello(Model model) {
        model.addAttribute("message", "XIN CHÀO Công ty FPT Ko!");
        return "home/home";
    }
}
