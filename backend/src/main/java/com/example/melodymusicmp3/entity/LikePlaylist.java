package com.example.melodymusicmp3.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "like_playlist")
public class LikePlaylist {
    @EmbeddedId
    private LikePlaylistId likePlaylistId;
}
