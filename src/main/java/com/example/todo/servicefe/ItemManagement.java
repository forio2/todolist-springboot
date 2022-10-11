package com.example.todo.servicefe;

import com.example.todo.modelfe.Item;
import com.example.todo.modelfe.User;

import java.util.ArrayList;
import java.util.List;

public class ItemManagement {

    private List<Item> itemsList= new ArrayList<>();

    private List<Item> currentUserItemList = new ArrayList<>();

    public void setItemList (List<Item> itemList) {this.itemsList = itemList;}

    public List<Item> getItemsList () {return this.itemsList;}

    private List<Item> itemListToMap (List<Item> list) {
        itemsList.clear();
        for (Item item : list) {
            itemsList.add(item);
        }
        return itemsList;
    }

    public void setItemMapFromList (List<Item> itemList) {

        this.itemsList = itemListToMap(itemList);
    }
}
