package com.example.melodymusicmp3.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data

public class Singer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String description;
    @ManyToMany
    @JoinTable
    private List<Song> songs;
}
