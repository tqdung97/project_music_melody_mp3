package com.example.melodymusicmp3.entity;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true, length = 50)
    private String userName;

    @Column(nullable = false)
    private String password;

    @ManyToOne
    private Role role;

    @OneToOne
    private Guests guest;
}
