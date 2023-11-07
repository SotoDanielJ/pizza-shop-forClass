package org.wecancodeit.pizzashop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StaffMemberController {
  
    @GetMapping("/")
    public String sayHello(){
        return "home/helloWorld";
    }
}
