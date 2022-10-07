package com.example.todolistspringboot.service.implement;

import com.example.todolistspringboot.dao.ItemDao;
import com.example.todolistspringboot.dao.UserDao;
import com.example.todolistspringboot.entity.Item;
import com.example.todolistspringboot.entity.User;
import com.example.todolistspringboot.exceptions.UserNotExists;
import com.example.todolistspringboot.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    ItemDao itemDao;

    @Autowired
    UserDao userDao;
    @Override
    public List<Item> getAllItems() {
        return itemDao.getAllItems();
    }

    @Override
    public Item getItem(Long id) {
        return itemDao.getItemById(id);
    }

    @Override
    public Item addItem(Long id, Item item) {
        User user1 = userDao.getUserById(id);
        if(user1 == null) throw new UserNotExists();
        item.setUserItem(user1);
        return itemDao.add(item);
    }

    @Override
    public Item updateItem(Long id, Item item) {
        User user1 = userDao.getUserById(id);
        if(user1 == null) throw new UserNotExists();
        Item update = itemDao.getItemById(id);
        update.setDescription(item.getDescription());
        update.setPriority(item.getPriority());
        return itemDao.update(update);
    }
}
