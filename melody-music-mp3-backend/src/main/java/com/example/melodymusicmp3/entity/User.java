package com.example.melodymusicmp3.entity;
import jakarta.persistence.*;
import lombok.Data;
import java.util.Set;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = true, length = 50)
    private String username;
    @Column(nullable = false)
    private String password;
    @ManyToMany(fetch = FetchType.LAZY)
    private Set<Role> roles;
    @OneToOne
    private UserDetail userDetail;

}



