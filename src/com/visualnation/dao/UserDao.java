package com.visualnation.dao;

import com.visualnation.entities.User;

import java.util.List;

public interface UserDao {

    public void saveUser(User theUser);

    public User loginUser(User theUser);
}
