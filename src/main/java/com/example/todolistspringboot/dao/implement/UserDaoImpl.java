package com.example.todolistspringboot.dao.implement;

import com.example.todolistspringboot.entity.User;
import com.example.todolistspringboot.dao.UserDao;
import com.example.todolistspringboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.findByUserId(id);
    }
}
