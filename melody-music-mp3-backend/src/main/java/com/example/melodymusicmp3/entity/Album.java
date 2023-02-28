package com.example.melodymusicmp3.entity;

import jakarta.persistence.Entity;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Entity
@Data
public class Album {
    private String id;
    private String name;
    private Date creationTime;
    private Long numberOfView;
    private List<Singer> singers;
    private User user;
}
