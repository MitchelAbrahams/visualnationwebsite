package com.visualnation.controllers;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/user")
public class UserController {

    @InitBinder
    public void initBinder(WebDataBinder dataBinder){
        StringTrimmerEditor stringTrimmer = new StringTrimmerEditor(true);
        dataBinder.registerCustomEditor(String.class, stringTrimmer);
    }

    @RequestMapping("/account")
    public String register(Model model){

        User theUser = new User();

        model.addAttribute("user", theUser);

        return "register";
    }

    @RequestMapping("/register")
    public String register(@Valid @ModelAttribute("user") User theUser, BindingResult theBindingResult){

        if(theBindingResult.hasErrors()) {
            return "register";
        } else{
            return "homepage";
        }
    }
}
