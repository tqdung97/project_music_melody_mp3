package com.example.melodymusicmp3.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Entity
@Data
public class CommentSong {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 1000)
    private String content;
    @Column(nullable = false)
    @UpdateTimestamp
    private Date creationTime;
    @ManyToOne
    private Song song;
    @ManyToOne
    private User user;
}
