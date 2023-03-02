package com.example.melodymusicmp3.entity;

import jakarta.persistence.Embeddable;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import java.io.Serializable;
@Data
@Embeddable
public class LikeSongId implements Serializable {
    @ManyToOne
    private Song song;
    @ManyToOne
    private User user;

}
