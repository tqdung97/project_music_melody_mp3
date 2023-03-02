package com.example.melodymusicmp3.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
public class LikeSong {
    private LikeSongId likeSongId;


    public LikeSong() {

    }
}
