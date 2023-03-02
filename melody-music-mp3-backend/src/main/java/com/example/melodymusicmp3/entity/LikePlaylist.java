package com.example.melodymusicmp3.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class LikePlaylist {
    @EmbeddedId
    private LikePlaylistId likePlaylistId;
}
