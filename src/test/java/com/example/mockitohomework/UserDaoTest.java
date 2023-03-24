package com.example.mockitohomework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserDaoTest {


    private UserDao userDao;

    @BeforeEach
    public void setUp() {
        userDao = new UserDaoImpl();
    }


    @Test
    public void testGetUserByNameExistingUser() {
        String existingUser = "Максим";
        User user = userDao.getUserByName(existingUser);
        assertNotNull(user);
        assertEquals(existingUser, user.getName());
    }

    @Test
    public void testGetUserByNameNonExistingUser() {
        String nonExistingUSer = "Владимир";
        User user = userDao.getUserByName(nonExistingUSer);
        assertNull(user);
    }

}