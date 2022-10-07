package com.example.todolistspringboot.controller;

import com.example.todolistspringboot.exceptions.UserNotExists;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletResponse;

@org.springframework.web.bind.annotation.RestControllerAdvice
public class RestControllerAdvice {

    @ExceptionHandler(UserNotExists.class)
    public String handleNoUserException(UserNotExists ex, HttpServletResponse response){
        try{
            response.sendError(1000);
        }catch (Exception e){
            e.printStackTrace();
        }
        return ex.getMessage();
    }

}
