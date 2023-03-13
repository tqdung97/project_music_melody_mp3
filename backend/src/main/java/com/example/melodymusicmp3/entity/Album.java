package com.example.melodymusicmp3.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "album")
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;


    @Column(name ="name",nullable = false)
    private String name;

    @Column(name = "creation_time" ,nullable = false)
    private Date creationTime;

    @Column(name = "number_of_view", nullable = false)
    private Long numberOfView;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "album_singers",
    joinColumns = @JoinColumn(name = "album_id"),
    inverseJoinColumns = @JoinColumn(name = "singger_id"))
    private List<Singer> singers;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
