package org.wecancodeit.pizzashop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;

import org.wecancodeit.pizzashop.Dto.LoginDto;
import org.wecancodeit.pizzashop.services.LoginService;

@Controller
public class HomeController {

    private LoginService loginService;

    public HomeController(LoginService loginService) {
        this.loginService = loginService;
    }

    @RequestMapping({ "/", "", "/home" })
    public String home() {
        return "home/helloWorld";

    }

    @GetMapping("/login")
    public String showLogin(Model model) {
        model.addAttribute("loginDto", new LoginDto());
        return "home/login";
    }

    @PostMapping("/login")
    public String loginMethod(@ModelAttribute LoginDto dto) {
        if (loginService.loginUser(dto)) {
            return "redirect:/PizzaMenu";
        }
        return "redirect:/home";
    }
}
