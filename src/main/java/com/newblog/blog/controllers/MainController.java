package com.newblog.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // отвечает за переходы на сайте
public class MainController {

    @GetMapping("/") // при переходе сюда, работает код ниже
    public String home (Model model) {
        model.addAttribute("title", "Главная страница");
        return "home";
    }
    @GetMapping("/about") // при переходе сюда, работает код ниже
    public String about (Model model) {
        model.addAttribute("title", "Страница о нас");
        return "about";
    }

}