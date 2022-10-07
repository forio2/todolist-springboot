package com.example.todo.modelfe;

import java.util.List;

public class User {

    private Long id;
    private String username;
    private List<Item> itemId;

    public User(Long id, String username, List<Item> itemId) {
        this.id = id;
        this.username = username;
        this.itemId = itemId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<Item> getItemId() {
        return itemId;
    }

    public void setItemId(List<Item> itemId) {
        this.itemId = itemId;
    }
}
