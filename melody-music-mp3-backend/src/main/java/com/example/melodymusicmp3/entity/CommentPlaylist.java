package com.example.melodymusicmp3.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class CommentPlaylist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 1000)
    private String content;
    @ManyToOne
    private User user;
    @ManyToOne
    private Playlist playlist;

}
