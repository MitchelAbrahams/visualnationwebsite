package com.visualnation.controllers;

import com.visualnation.entities.NewsItem;
import com.visualnation.service.NewsItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/backend")
public class BackendConroller {

    @Autowired
    private NewsItemService newsItemService;

    @RequestMapping("/dashboard")
    public String getNewsItems(HttpSession session, ModelMap model){


            List<NewsItem> newsItemList = newsItemService.getNewsItems();

            model.addAttribute("item", newsItemList);
            model.addAttribute("test", "now this should work");

            return "account-detail";
    }
}
