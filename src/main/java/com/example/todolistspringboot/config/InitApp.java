package com.example.todolistspringboot.config;

import com.example.todo.modelfe.Item;
import com.example.todo.modelfe.Status;
import com.example.todolistspringboot.entity.User;
import com.example.todolistspringboot.repository.ItemRepository;
import com.example.todolistspringboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;


@Component
public class InitApp implements ApplicationListener<ApplicationReadyEvent> {
    @Autowired
    UserRepository userRepository;
    @Autowired
    ItemRepository itemRepository;

    @Override
    @Transactional
    public void onApplicationEvent(ApplicationReadyEvent event) {
        User user1, user2, user3;
        user1 = userRepository.save(
                User.builder()
                        .username("fax")
                        .build()
        );
        user2 = userRepository.save(
                User.builder()
                        .username("ohm")
                        .build()
        );
        user3 = userRepository.save(
                User.builder()
                        .username("next")
                        .build()
        );
        Item tempItem;
        tempItem = itemRepository.save(
                Item.builder()
                        .description("The first")
                        .status(Status.ACTIVE)
                        .priority(1)
                        .build()
        );
        tempItem.setUserItem(user1);
        user1.getItemId().add(tempItem);
    }
}
