package com.example.melodymusicmp3.entity;

import jakarta.persistence.Entity;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Entity
@Data
public class Playlist {
    private Long id;
    private String name;
    private Date creationTime;
    private String avatar;
    private Long view;
    private User user;
    private List<Song> songs;


}
