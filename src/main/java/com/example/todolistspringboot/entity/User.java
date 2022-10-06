package com.example.todolistspringboot.entity;

import lombok.*;
import javax.persistence.*;
import java.util.List;

@Data
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Exclude
    Long id;
    String username;
    @OneToMany(mappedBy = "userItem")
    List<Item> itemId;
}
