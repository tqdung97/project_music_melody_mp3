package com.example.melodymusicmp3.entity;

import jakarta.persistence.Entity;
import lombok.Data;

import java.util.List;

@Entity
@Data

public class Singer {
    private Long id;
    private String name;
    private String description;
    private List<Song> songs;
}
