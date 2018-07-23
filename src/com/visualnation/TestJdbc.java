package com.visualnation;


import com.visualnation.entities.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class TestJdbc {

    public static void main(String[] args){

        SessionFactory factory = new Configuration()
                                .configure("hibernate.cfg.xml")
                                .addAnnotatedClass(User.class)
                                .buildSessionFactory();

        Session session = factory.getCurrentSession();


        try{

            // saving object to DB
            User user = new User("ingezoutenbier","Inge1991", "ingezoutenbier@hotmail.com");
            session.beginTransaction();
            session.save(user);
            session.getTransaction().commit();

            // Getting obj from DB
            session = factory.getCurrentSession();
            session.beginTransaction();
            User theUser = session.get(User.class, user.getId());

            System.out.println("Get complete " + theUser);

            session.getTransaction().commit();

        }
        finally {
            factory.close();
        }

    }
}
