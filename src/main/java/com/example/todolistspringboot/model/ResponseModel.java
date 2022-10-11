package com.example.todolistspringboot.model;

import com.example.todolistspringboot.entity.Item;
import com.example.todolistspringboot.entity.ItemDTO;
import org.springframework.lang.Nullable;

import java.util.List;

public class ResponseModel {
    ResponseStatusObj status;
    List<ItemDTO> data;
    public ResponseModel(List<ItemDTO> items, String code){
        this.status = new ResponseStatusObj();
        this.status.code = code;
        this.status.description = "todo list added";
        this.data = items;
    }
}