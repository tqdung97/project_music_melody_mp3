package com.example.melodymusicmp3.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class LikeSong {
    @EmbeddedId
    private LikeSongId likeSongId;

    public LikeSong(LikeSongId likeSongId) {
        this.likeSongId = likeSongId;
    }

    public LikeSong() {
    }
}
