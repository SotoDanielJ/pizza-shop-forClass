package org.wecancodeit.pizzashop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.wecancodeit.pizzashop.dto.LoginDto;

@Controller
public class HomeController {

    @GetMapping("/")
    public String loginUser(Model model) {
        model.addAttribute("loginDto", new LoginDto());
        return "home/login";
    }

    @PostMapping("/login" )
    public String loginMethod(@ModelAttribute LoginDto dto) {
        return "redirect:/PizzaMenu";
    }
}
