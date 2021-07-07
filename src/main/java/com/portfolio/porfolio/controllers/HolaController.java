package com.portfolio.porfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
 
@Controller
public class HolaController {
 
    @RequestMapping("/welcome")
    public String mensaje() {
         
        return "welcome";
    }
}