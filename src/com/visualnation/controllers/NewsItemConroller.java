package com.visualnation.controllers;

import com.visualnation.entities.NewsItem;
import com.visualnation.service.NewsItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class NewsItemConroller {

    @Autowired
    private NewsItemService newsItemService;

    @ModelAttribute
    public void getNewsItems(HttpSession session, Model model){


            List<NewsItem> newsItemList = newsItemService.getNewsItems();

            model.addAttribute("item", newsItemList);
    }
}
