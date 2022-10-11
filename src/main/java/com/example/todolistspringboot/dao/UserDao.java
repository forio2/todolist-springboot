package com.example.todolistspringboot.dao;

import com.example.todolistspringboot.entity.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();
    User getUserById(Long id);
}