package com.example.todo.modelfe;

import com.example.todolistspringboot.entity.User;
import lombok.*;
import javax.persistence.*;


public class Item {
    private Long id;
    private String description;
    private Status status = Status.ACTIVE;
    private Integer priority;
    private User userItem;

    public void Item (){

    }

    public Item(String description, Integer priority) {
        this.description = description;
        this.status = Status.ACTIVE;
        this.priority = priority;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public User getUserItem() {
        return userItem;
    }

    public void setUserItem(User userItem) {
        this.userItem = userItem;
    }
}
