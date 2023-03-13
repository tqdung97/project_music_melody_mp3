package com.example.melodymusicmp3.entity;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
@Table(name = "comment_singer")
public class CommentSinger {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;

    @Column(name = "content" ,nullable = false, columnDefinition = "TEXT")
    private String content;

    @ManyToOne
    @JoinColumn(name = "user_detail_id")
    private UserDetail userDetail;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
