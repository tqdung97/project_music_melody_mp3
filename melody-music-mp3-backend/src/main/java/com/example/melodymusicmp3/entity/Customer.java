package com.example.melodymusicmp3.entity;

import lombok.Data;

@Data
public class Customer {
    private Long id;
    private String name;
    private String userName;
    private String password;
    private String address;
    private String email;
    private String numberPhone;
    private String avatar;
}
