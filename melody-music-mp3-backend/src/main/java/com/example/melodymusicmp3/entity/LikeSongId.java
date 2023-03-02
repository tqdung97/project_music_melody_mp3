package com.example.melodymusicmp3.entity;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class LikeSongId implements Serializable {
    private Song song;
    private User user;
}
