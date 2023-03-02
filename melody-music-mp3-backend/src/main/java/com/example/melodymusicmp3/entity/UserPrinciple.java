package com.example.melodymusicmp3.entity;

import lombok.Data;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
@Data
public class UserPrinciple implements UserDetails {
    private Long id;
    private String username;
    private String password;
    private Role role;
    private UserDetail userDetail;
    private Collection<? extends GrantedAuthority> roles;
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return roles;
    }
    public UserPrinciple(Long id, String username, String password, UserDetail userDetail, Collection<? extends GrantedAuthority> roles) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.userDetail = userDetail;
        this.roles = roles;
    }
    public static UserPrinciple build(User user){
        List<GrantedAuthority> authorities = user.getRoles().stream().map(role ->
                new SimpleGrantedAuthority(role.getRole())
        ).collect(Collectors.toList());
        return new UserPrinciple(
                user.getId(),
                user.getUsername(),
                user.getPassword(),
                user.getUserDetail(),
                authorities
        );
    };


    @Override
    public boolean isAccountNonExpired() {
        return true;
    }
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }
    @Override
    public boolean isEnabled() {
        return true;
    }
}