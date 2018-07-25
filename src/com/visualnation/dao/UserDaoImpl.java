package com.visualnation.dao;

import com.visualnation.entities.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    //inject session factory
    @Autowired
    private SessionFactory sessionFactory;


    @Override
    public void saveUser(User theUser) {
        // Get current session
        Session currentSession = sessionFactory.getCurrentSession();

        // Save the user
        currentSession.save(theUser);

        currentSession.close();
    }

    @Override
    public User loginUser(User theUser) {

        User user = null;

        // Get current session
        Session currentSession = sessionFactory.getCurrentSession();

        // Query to get al the users
        Query<User> userQuery = currentSession.createQuery("from User", User.class);

        // Result set places al the users in users list
        List<User> users = userQuery.getResultList();

        //loop trough users and check if username and password user input matches any of the users info in the list.
        for(int i = 0; i <  users.size(); i++){
            if(theUser.getUsername().equals(users.get(i).getUsername())){
                user = users.get(i);
            }
        }
        return user;
    }
}
