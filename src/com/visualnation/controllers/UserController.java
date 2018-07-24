package com.visualnation.controllers;

import com.visualnation.entities.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/user")
public class UserController {

   private SessionFactory factory = new Configuration()
            .configure("hibernate.cfg.xml")
            .addAnnotatedClass(User.class)
            .buildSessionFactory();

   private Session session = factory.getCurrentSession();

    @InitBinder
    public void initBinder(WebDataBinder dataBinder){
        StringTrimmerEditor stringTrimmer = new StringTrimmerEditor(true);
        dataBinder.registerCustomEditor(String.class, stringTrimmer);
    }

    @RequestMapping("/account")
    public String showPage(Model model){

        User theUser = new User();

        model.addAttribute("user", theUser);

        return "account";
    }

    @RequestMapping("/register")
    public String register(@Valid @ModelAttribute("user") User theUser, BindingResult theBindingResult, ModelMap model){

        // Bind the values
//        model.addAttribute("username", theUser.getUsername());
//        model.addAttribute("password", theUser.getPassword());
//        model.addAttribute("email", theUser.getEmail());
//        model.addAttribute("country", theUser.getCountry());

        if(theBindingResult.hasErrors()) {
//            User user = new User();
//            session.beginTransaction();
//            session.save(user);
//            session.getTransaction().commit();
            return "account";
        } else{
            return "homepage";
        }
    }
}
