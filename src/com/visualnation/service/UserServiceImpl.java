package com.visualnation.service;

import com.visualnation.dao.UserDao;
import com.visualnation.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    @Transactional
    public void saveUser(User theUser) {
        userDao.saveUser(theUser);
    }

    @Override
    @Transactional
    public User loginUser(User theUser) {
       return userDao.loginUser(theUser);
    }


}
