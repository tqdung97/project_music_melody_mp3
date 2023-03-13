package com.example.melodymusicmp3.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "guest")
@Data
public class Guest {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;
    private String name;
    private String address;
    private String email;
    private String tel;
    private String avatar;
    @OneToOne
    private User user;
}
