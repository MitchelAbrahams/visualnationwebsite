package com.visualnation.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegisterControler {

    @RequestMapping("register")
    public String sendInfo(@RequestAttribute("username")String username, Model model){

        String usernameCaps = username.toUpperCase();

        model.addAttribute("usernameCaps", usernameCaps);

        return "register";
    }
}
