package com.example.melodymusicmp3.entity;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Category {
    private Long id;
    private String name;
}
