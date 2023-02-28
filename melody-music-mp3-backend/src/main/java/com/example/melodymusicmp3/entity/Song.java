package com.example.melodymusicmp3.entity;

import jakarta.persistence.Entity;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Entity
@Data
public class Song {
    private Long id;
    private String name;
    private String file;
    private Date creationTime;
    private Long numberOfView;
    private String author;
    private String avatar;
    private String lyric;
    private Album album;
    private User user;
    private List<Singer> singers;
}
