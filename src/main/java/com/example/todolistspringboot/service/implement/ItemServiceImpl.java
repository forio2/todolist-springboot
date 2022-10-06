package com.example.todolistspringboot.service.implement;

import com.example.todolistspringboot.dao.ItemDao;
import com.example.todolistspringboot.entity.Item;
import com.example.todolistspringboot.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    ItemDao itemDao;

    @Override
    public List<Item> getAllItems() {
        return itemDao.getAllItems();
    }

    @Override
    public Item getItem(Long id) {
        return itemDao.getItemById(id);
    }

    @Override
    public Item addItem(Item item) {
        return itemDao.add(item);
    }

    @Override
    public Item updateItem(Long id, Item item) {
        Item update = itemDao.getItemById(id);
        update.setDescription(item.getDescription());
        update.setStatus(item.getStatus());
        return itemDao.update(update);
    }
}
