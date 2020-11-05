package com.example.service.impl;

import com.example.dao.UserDao;
import com.example.entity.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService
{
    @Autowired
    private UserDao userDao;


    @Override
    public List<User> getUserList()
    {
        List<User> userList = userDao.findAllUser();
        return userList;
    }
}
