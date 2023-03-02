package com.example.melodymusicmp3.entity;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class LikePlaylist {
    private Playlist playlist;
    private User user;
}
