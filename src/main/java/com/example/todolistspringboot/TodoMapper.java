package com.example.todolistspringboot;

import java.util.List;
import java.util.stream.Collectors;

import com.example.todolistspringboot.entity.Item;
import com.example.todolistspringboot.entity.ItemDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(imports = Collectors.class)
public interface TodoMapper {
    TodoMapper INSTANCE = Mappers.getMapper(TodoMapper.class);
    List<ItemDTO> getItems(List<Item> items);
}
