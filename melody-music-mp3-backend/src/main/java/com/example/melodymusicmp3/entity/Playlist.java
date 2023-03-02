package com.example.melodymusicmp3.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;
import java.util.List;

@Entity
@Data
public class Playlist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private Date creationTime;
    private String avatar;
    private Long view;
    @ManyToOne
    private User user;
    @ManyToMany(fetch = FetchType.LAZY)
    private List<Song> songs;
}
