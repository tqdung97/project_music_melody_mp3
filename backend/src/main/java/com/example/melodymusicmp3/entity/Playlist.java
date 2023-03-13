package com.example.melodymusicmp3.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Entity
@Data
@Table(name = "playlist")
public class Playlist {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;


    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "creation_time",nullable = false)
    private Date creationTime;

    @Column(name = "avatar", columnDefinition = "LONGBLOB")
    private String avatar;

    @Column(name = "view")
    private Long view;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "playlist_song",
            joinColumns = @JoinColumn(name = "playlist_id"),
            inverseJoinColumns = @JoinColumn(name = "song_id"))
    private List<Song> songs;



}
