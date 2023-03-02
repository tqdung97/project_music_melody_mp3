package com.example.melodymusicmp3.entity;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class CommentPlaylist {
    private Long id;
    private String content;
    private User user;
    private Playlist playList;

}
