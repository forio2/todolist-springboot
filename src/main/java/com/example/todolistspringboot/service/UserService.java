package com.example.todolistspringboot.service;

import com.example.todolistspringboot.entity.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();
    User getUser(Long id);
}
