package com.example.todolistspringboot.exceptions;


public class UserNotExists extends RuntimeException {

    public UserNotExists(){
        super(String.format("no user found"));
    }
}