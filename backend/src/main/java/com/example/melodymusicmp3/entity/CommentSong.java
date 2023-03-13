package com.example.melodymusicmp3.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Entity
@Data
@Table(name = "comment_song")
public class CommentSong {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;

    @Column(name = "content",nullable = false,columnDefinition = "TEXT")
    private String content;

    @Column(name = "creation_time",nullable = false)
    @UpdateTimestamp
    private Date creationTime;

    @ManyToOne
    @JoinColumn(name = "song_id")
    private Song song;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
