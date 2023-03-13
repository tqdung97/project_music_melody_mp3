package com.example.melodymusicmp3.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "like_song")
public class LikeSong {
    @EmbeddedId
    private LikeSongId likeSongId;

}
