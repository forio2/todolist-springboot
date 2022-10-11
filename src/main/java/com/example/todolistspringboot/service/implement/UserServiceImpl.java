package com.example.todolistspringboot.service.implement;

import com.example.todolistspringboot.entity.User;
import com.example.todolistspringboot.dao.UserDao;
import com.example.todolistspringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    public User getUser(Long id) {
        return userDao.getUserById(id);
    }
}