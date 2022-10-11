package com.example.todolistspringboot.repository;

import com.example.todolistspringboot.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
