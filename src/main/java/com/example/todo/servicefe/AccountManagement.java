package com.example.todo.servicefe;

import com.example.todo.modelfe.User;

import java.util.ArrayList;
import java.util.List;

public class AccountManagement {
    private List<User> userMap = new ArrayList<>();

    private User currentUser;

    public AccountManagement(){
        this.currentUser = new User();
    }

    public User getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }

    public List<User> getUserMap() {
        return userMap;
    }

    public void setUserMap(List<User> userMap) {
        this.userMap = userMap;
    }
}
