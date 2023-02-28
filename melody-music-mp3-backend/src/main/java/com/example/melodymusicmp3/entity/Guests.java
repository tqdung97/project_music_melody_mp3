package com.example.melodymusicmp3.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Guests {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String address;
    private String email;
    private String numberPhone;
    private String avatar;
    @OneToOne
    private User user;

}
