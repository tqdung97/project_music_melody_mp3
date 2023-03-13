package com.example.melodymusicmp3.dto;

import lombok.Data;

@Data
public class Track {
    private Long index;
    private String link;
    private String title;
    private Long startOffSet;
    private Long endOffSet;
    private Long duration;
    private String artist;
}
