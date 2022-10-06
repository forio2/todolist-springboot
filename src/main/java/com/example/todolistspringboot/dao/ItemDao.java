package com.example.todolistspringboot.dao;

import com.example.todolistspringboot.entity.Item;

import java.util.List;

public interface ItemDao {
    List<Item> getAllItems();
    Item getItemById(Long id);
    Item add(Item item);
    Item update(Item item);
}
