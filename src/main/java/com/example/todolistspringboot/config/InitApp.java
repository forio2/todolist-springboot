package com.example.todolistspringboot.config;

import com.example.todolistspringboot.entity.User;
import com.example.todolistspringboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class InitApp implements ApplicationListener<ApplicationReadyEvent> {
    @Autowired
    UserRepository userRepository;

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
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
    }
}
