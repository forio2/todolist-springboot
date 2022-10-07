package com.example.todolistspringboot.entity;

import lombok.*;
import javax.persistence.*;

@Data
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Exclude
    Long id;
    String description;
    @Enumerated(EnumType.STRING)
    Status status;
    Integer priority;
    @ManyToOne
    User userItem;
}
