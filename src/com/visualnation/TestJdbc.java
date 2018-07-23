package com.visualnation;


import com.visualnation.entities.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestJdbc {

    public static void main(String[] args){

        SessionFactory factory = new Configuration()
                                .configure("hibernate.cfg.xml")
                                .addAnnotatedClass(User.class)
                                .buildSessionFactory();

        Session session = factory.getCurrentSession();


        try{
            User user = new User("visualnation","Vrijdag1990!?", "visualnationnl@gmail.com");
            session.beginTransaction();
            session.save(user);
            session.getTransaction().commit();

        }
        finally {
            factory.close();
        }

    }
}
