package com.example.todolistspringboot.dao.implement;

import com.example.todolistspringboot.dao.ItemDao;
import com.example.todolistspringboot.entity.Item;
import com.example.todolistspringboot.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ItemDaoImpl implements ItemDao {
    @Autowired
    ItemRepository itemRepository;


    @Override
    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }

    @Override
    public Item getItemById(Long id) {
        return itemRepository.findById(id).orElse(null);
    }

    @Override
    public Item add(Item item) { return itemRepository.save(item); }

    @Override
    public Item update(Item item) {
        return itemRepository.save(item);
    }
}
