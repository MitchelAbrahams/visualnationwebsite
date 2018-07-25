package com.visualnation.service;

import com.visualnation.entities.User;

import java.util.List;

public interface UserService {

    public void saveUser(User theUser);

    public User loginUser(User theUser);
}
