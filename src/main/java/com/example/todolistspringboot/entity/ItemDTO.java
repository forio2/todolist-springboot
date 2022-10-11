package com.example.todolistspringboot.entity;

import lombok.*;

import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ItemDTO {
    Long id;
    String description;
    String status;
    Integer priority;
}
