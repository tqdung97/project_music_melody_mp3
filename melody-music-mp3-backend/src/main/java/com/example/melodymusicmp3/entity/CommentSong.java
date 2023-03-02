package com.example.melodymusicmp3.entity;

import java.util.Date;

public class CommentSong {
    private Long id;
    private String content;
    private Date creationTime;
    private Song song;
    private User user;
}
