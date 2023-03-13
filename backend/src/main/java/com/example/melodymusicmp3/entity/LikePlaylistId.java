package com.example.melodymusicmp3.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Embeddable
@Data
@Table(name = "like_playlist_id")
public class LikePlaylistId implements Serializable {
    @ManyToOne
    @JoinColumn(name = "playlist_id")
    private Playlist playlist;


    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

}
