package com.visualnation.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {


    @RequestMapping("/")
    public String showPage(){
        return "homepage";
    }

    @RequestMapping("test")
    public String showRegisterPage(){
        return "register";
    }

}
