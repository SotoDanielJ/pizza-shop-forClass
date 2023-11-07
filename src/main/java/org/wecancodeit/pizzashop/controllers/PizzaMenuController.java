package org.wecancodeit.pizzashop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.wecancodeit.pizzashop.services.PizzaMenuService;

@Controller
public class PizzaMenuController {
    private PizzaMenuService pizzaMenuService;

    public PizzaMenuController(PizzaMenuService pizzaMenuService) {
        this.pizzaMenuService = pizzaMenuService;
    }

    @GetMapping("/PizzaMenu/{id}")
    public String getMenuItem(@PathVariable long id, Model model){
        model.addAttribute("pizzaMenuItem", pizzaMenuService.getMenu(id));
        model.addAttribute("pizzaTitle", "This is a pizza menu");
        return "menus/displayMenu";
    }
    
     @GetMapping("/PizzaMenu")
    public String getAllMenuItem(Model model){
        model.addAttribute("pizzaMenuItems", pizzaMenuService.listMenus());
        return "menus/displayAllMenus";
    }

}
