package com.visualnation;


import com.visualnation.entities.NewsItem;
import com.visualnation.entities.User;
import com.visualnation.service.NewsItemService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class TestJdbc {

    public static void main(String[] args){

        SessionFactory factory = new Configuration()
                                .configure("hibernate.cfg.xml")
                                .addAnnotatedClass(NewsItem.class)
                                .buildSessionFactory();

        Session session = factory.getCurrentSession();


        try{
            // OLD EXAMPLES
            // saving object to DB
//            NewsItem newsItem = new NewsItem("26-07-2018, Nijmegen", "super cool", "Nog een nieuw item nigguh");
//            session.beginTransaction();
//            session.save(newsItem);
//            session.getTransaction().commit();

            // Getting obj from DB
//            int userId = 8;
//
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//            User theUser = session.get(User.class, userId);
//
//            System.out.println("changing the username of: " + theUser);
//
//            theUser.setUsername("new username");
//
//            session.getTransaction().commit();

           // NEW EXAMPLES
            session.beginTransaction();
            List<NewsItem> userList = session.createQuery("from NewsItem ").getResultList();

            for(NewsItem tempUsers : userList){
                System.out.println(tempUsers);
            }

            session.getTransaction().commit();


        }
        finally {
            factory.close();
        }
    }
}
