package com.example.melodymusicmp3.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "username", nullable = false)
    private String username;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "address", nullable = false,columnDefinition = "TEXT")
    private String address;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "number_phone", nullable = false, unique = true)
    private String numberPhone;

    @Column(name = "avatar", columnDefinition = "LONGBLOB")
    private String avatar;
}
