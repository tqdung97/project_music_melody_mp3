package com.example.melodymusicmp3.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "user_detail")
public class UserDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;
    private String name;
    private String address;
    private String email;
    private String numberPhone;
    private String avatar;

    @OneToOne
    @JsonIgnore
    private User user;

}
