package com.example.melodymusicmp3.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "singer")
public class Singer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "description", nullable = false, columnDefinition = "TEXT")
    private String description;

    @ManyToMany
    @JoinTable(name = "singer_song",
            joinColumns = @JoinColumn(name = "singer_id"),
            inverseJoinColumns = @JoinColumn(name = "song_id"))
    private List<Song> songs;
}
