package com.example.todolistspringboot.config;

import com.example.todolistspringboot.entity.Item;
import com.example.todolistspringboot.entity.Status;
import com.example.todolistspringboot.entity.User;
import com.example.todolistspringboot.repository.ItemRepository;
import com.example.todolistspringboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class InitApp implements ApplicationListener<ApplicationReadyEvent> {
    @Autowired
    UserRepository userRepository;
    @Autowired
    ItemRepository itemRepository;

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
//        User user1, user2, user3;
        userRepository.save(
                User.builder()
                        .username("fax")

                        .build()
        );
        userRepository.save(
                User.builder()
                        .username("ohm")
                        .build()
        );
        userRepository.save(
                User.builder()
                        .username("next")
                        .build()
        );

//        itemRepository.save(
//                Item.builder()
//                        .description("The first")
//                        .status(Status.ACTIVE)
//                        .order(1)
//                        .userItem(user1)
//                        .build()
//        );
//        itemRepository.save(
//                Item.builder()
//                        .description("The second")
//                        .status(Status.COMPLETED)
//                        .order(2)
//                        .userItem(user2)
//                        .build()
//        );
//        itemRepository.save(
//                Item.builder()
//                        .description("The third")
//                        .status(Status.ACTIVE)
//                        .order(3)
//                        .userItem(user3)
//                        .build()
//        );
    }
}
