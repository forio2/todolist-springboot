package com.example.todolistspringboot.controller;

import com.example.todolistspringboot.TodoMapper;
import com.example.todolistspringboot.entity.Item;
import com.example.todolistspringboot.entity.ItemDTO;
import com.example.todolistspringboot.entity.User;
import com.example.todolistspringboot.model.ResponseModel;
import com.example.todolistspringboot.model.ResponseStatusObj;
import com.example.todolistspringboot.service.ItemService;
import com.example.todolistspringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/todo")
public class ItemController {
    @Autowired
    ItemService itemService;

    @GetMapping("/inquiry")
    public ResponseEntity<?> showAllItems(@RequestBody User user) {
        List<ItemDTO> items = TodoMapper.INSTANCE.getItems(itemService.getAllItems(user.getId()));
//        return ResponseEntity.status(HttpStatus.OK).body(new ResponseModel(items,"1000"));
        return ResponseEntity.ok(items);
    }

    @PostMapping("/add")
    public ResponseEntity<?> addItem(@RequestBody Item item) {
        return ResponseEntity.ok(itemService.addItem(item));
    }

    @PostMapping("/update")
    public ResponseEntity<?> updateItem(@RequestBody Item item) {
        return ResponseEntity.ok(itemService.updateItem(item.getUserItem().getId(), item));
    }

}
