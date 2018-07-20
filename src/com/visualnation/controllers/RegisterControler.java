package com.visualnation.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegisterControler {

    @RequestMapping("register")
    public String sendInfo(){
        return "register";
    }
}
