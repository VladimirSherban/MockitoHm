package com.example.mockitohomework.service;

import com.example.mockitohomework.User;
import com.example.mockitohomework.UserDao;


public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }


    @Override
    public boolean checkUserExist(User user) {
        User foundUser = userDao.getUserByName(user.getName());
        return foundUser != null;
    }
}
