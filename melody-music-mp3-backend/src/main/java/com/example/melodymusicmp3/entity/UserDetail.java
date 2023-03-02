package com.example.melodymusicmp3.entity;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class UserDetail {
    private Long id;
    private String name;
    private String address;
    private String email;
    private String numberPhone;
    private String avatar;
    private User user;

}
