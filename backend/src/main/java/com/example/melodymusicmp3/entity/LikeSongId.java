package com.example.melodymusicmp3.entity;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import java.io.Serializable;
@Data
@Embeddable
@Table(name = "like_song_id")
public class LikeSongId implements Serializable {
    @ManyToOne
    @JoinColumn(name = "song_id")
    private Song song;


    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

}
