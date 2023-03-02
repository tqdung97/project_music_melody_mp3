package com.example.melodymusicmp3.entity;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class CommentSinger {
    private Long id;
    private String content;
    private UserDetail userDetail;
    private User user;
}
