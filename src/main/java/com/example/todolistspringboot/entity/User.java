package com.example.todolistspringboot.entity;

import com.example.todolistspringboot.entity.Item;
import lombok.*;
import javax.persistence.*;
import java.util.ArrayList;
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
    @Builder.Default
    List<Item> itemId = new ArrayList<>();
}
