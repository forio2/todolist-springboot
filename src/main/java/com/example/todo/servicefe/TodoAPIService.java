package com.example.todo.servicefe;

import com.example.todo.modelfe.Item;
import com.example.todo.modelfe.User;
import org.json.JSONObject;
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
        ResponseEntity<Item[]> response = restTemplate.getForEntity(url+"todo/inquiry", Item[].class);
        Item[] item = response.getBody();
        return Arrays.asList(item);
    }

    public void addItem(Item item){
        restTemplate.postForObject(url+"add", item, Item.class);
    }

    public void addUser(User user){
        restTemplate.postForObject(url+"users", user, User.class);
    }

    // Test
    public String getJSONBody (){
        String str = restTemplate.getForObject(url+"todo/inquiry", String.class);
        return str;
    }

    public String createJSONStr(Long id, String username){
        return "{ \"id\":"+ id + ", \"username\":" + username + "}";
    }

    // end Test


    // need to find a way to sent JSON Body to GET Method @RequestMapping
    public List<Item> getAllItems(){
        ResponseEntity<Item[]> responseItem = restTemplate.getForEntity(url+"todo/inquiry", Item[].class);
        Item[] items = responseItem.getBody();
        return Arrays.asList(items);
    }
}
