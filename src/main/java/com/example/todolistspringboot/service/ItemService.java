package com.example.todolistspringboot.service;

import com.example.todolistspringboot.entity.Item;
import com.example.todolistspringboot.entity.User;

import java.util.List;

public interface ItemService {
    List<Item> getAllItems();
    Item getItem(Long id);
    Item addItem(Long id, Item item);
    Item updateItem(Long id, Item item);
}
