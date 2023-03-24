package com.example.mockitohomework;

import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {

    private final List<User> userList = new ArrayList<>();

     UserDaoImpl() {
        userList.add(new User("Максим"));
        userList.add(new User("Алексей"));
        userList.add(new User("Марина"));
    }

    @Override
    public User getUserByName(String name) {
        for (User user : userList) {
            if (user.getName().equals(name)) {
                return user;
            }
        }
        return null;
    }

    @Override
    public List<User> findAllUsers() {
        return userList;
    }


}
