package com.visualnation;


import com.visualnation.entities.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;


public class TestJdbc {

    public static void main(String[] args){

        SessionFactory factory = new Configuration()
                                .configure("hibernate.cfg.xml")
                                .addAnnotatedClass(User.class)
                                .buildSessionFactory();

        Session session = factory.getCurrentSession();


        try{

            // OLD EXAMPLES
            // saving object to DB
//            User user = new User("ingezoutenbier","Inge1991", "ingezoutenbier@hotmail.com");
//            session.beginTransaction();
//            session.save(user);
//            session.getTransaction().commit();

            // Getting obj from DB
            int userId = 8;

            session = factory.getCurrentSession();
            session.beginTransaction();
            User theUser = session.get(User.class, userId);

            System.out.println("changing the username of: " + theUser);

            theUser.setUsername("new username");

            session.getTransaction().commit();

           // NEW EXAMPLES
//            session.beginTransaction();
//            List<User> userList = session.createQuery("from User u where u.username='ingezoutenbier'").getResultList();
//
//            for(User tempUsers : userList){
//                System.out.println(tempUsers);
//            }
//
//            session.getTransaction().commit();


        }
        finally {
            factory.close();
        }
    }
}
