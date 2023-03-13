package com.example.melodymusicmp3.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Entity
@Data
@Table(name = "song")
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;

    @Column(name = "name", nullable = false)
    private String  name;

    @Column(name ="file", nullable = false)
    private String file;

    @Column(name = "creation_time", nullable = false)
    private Date creationTime;


    @Column(name = "number_of_view", nullable = false)
    private Long numberOfView;

    @Column(name = "author", nullable = false)
    private String author;

    @Column(name = "avatar", columnDefinition = "LONGBLOB")
    private String avatar;

    @Column(name ="lyric", columnDefinition = "TEXT")
    private String lyric;

    @ManyToOne
    @JoinColumn(name ="album_id")
    private Album album;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToMany(mappedBy = "songs")
    @JoinTable(name = "song_singers",
            joinColumns = @JoinColumn(name = "song_id"),
            inverseJoinColumns = @JoinColumn(name = "singers_id"))
    private List<Singer> singers;

}
