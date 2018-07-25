package com.visualnation.controllers;

import com.visualnation.entities.User;
import com.visualnation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

@Controller
@SessionAttributes("session")
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    // Checks all input that is passed trough and trims al white space in front and back of input
    // "         white space         " --------> "white space"
    @InitBinder
    public void initBinder(WebDataBinder dataBinder){
        StringTrimmerEditor stringTrimmer = new StringTrimmerEditor(true);
        dataBinder.registerCustomEditor(String.class, stringTrimmer);
    }

    @RequestMapping("/account")
    public String showPage(HttpSession session, Model model){


        if(session.getAttribute("userID") == null) {
            User theUser = new User();

            model.addAttribute("user", theUser);

            return "account";
        } else {
            return "account-detail";
        }
    }

    @PostMapping("/register")
    public String register(@Valid @ModelAttribute("user") User theUser, BindingResult theBindingResult, ModelMap model){

        if(theBindingResult.hasErrors()) {
            return "account";
        } else{
            userService.saveUser(theUser);
            return "homepage";
        }
    }

    @PostMapping("/login")
    public String login(@ModelAttribute("user") User theUser, ModelMap model, HttpSession session){

         User loggedInUser = userService.loginUser(theUser);

        if(loggedInUser.getUsername().equals(theUser.getUsername()) && loggedInUser.getPassword().equals(theUser.getPassword())){

            //put username and id in session
            session.setAttribute("username",loggedInUser.getUsername());
            session.setAttribute("userID",loggedInUser.getId());

            return "homepage";
        } else {
            return "account";
        }
    }
}
