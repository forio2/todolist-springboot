package com.example.todo.servicefe;

import com.example.todo.modelfe.Item;
import com.example.todo.modelfe.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

public class TodoAPIService {

    private RestTemplate restTemplate;

    private String url = "http://localhost:8080/";

    public TodoAPIService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public List<User> getUser(){
        ResponseEntity<User[]> response = restTemplate.getForEntity(url+"users", User[].class);
        User[] user = response.getBody();
        return Arrays.asList(user);
    }

    public List<Item> getItem(){
        ResponseEntity<Item[]> response = restTemplate.getForEntity(url+"items", Item[].class);
        Item[] item = response.getBody();
        return Arrays.asList(item);
    }

    public void addItem(Item item){
        restTemplate.postForObject(url+"add", item, Item.class);
    }

    public void addUser(User user){
        restTemplate.postForObject(url, user, User.class);
    }

    public void deleteItem(Item item){
        String urlDelete = url +"checkout/" + item.getId();
        restTemplate.delete(urlDelete, item, Item.class);
    }
}
