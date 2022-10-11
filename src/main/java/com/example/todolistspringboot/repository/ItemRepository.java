package com.example.todolistspringboot.repository;

import com.example.todo.modelfe.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
