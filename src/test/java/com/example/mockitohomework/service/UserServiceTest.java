package com.example.mockitohomework.service;

import com.example.mockitohomework.User;
import com.example.mockitohomework.UserDao;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;



class UserServiceTest {

    private final UserDao userDao = Mockito.mock(UserDao.class);
    private final UserService userService = new UserServiceImpl(userDao);

    @Test
    public void testCheckUserExistReturnsTrue() {
        User user = new User("Максим");
        Mockito.when(userDao.getUserByName("Максим")).thenReturn(new User("Максим"));
        assertTrue(userService.checkUserExist(user));
    }

    @Test
    public void testCheckUserExistReturnsFalse() {
        User user = new User("Владимир");
        Mockito.when(userDao.getUserByName("Владимир")).thenReturn(null);
        assertFalse(userService.checkUserExist(user));
    }
}
