package com.example.melodymusicmp3.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
@AllArgsConstructor
@Getter
@Setter
public class LikePlaylistId implements Serializable {
    private Playlist playlist;
    private User user;


}
