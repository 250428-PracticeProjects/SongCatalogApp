/*
Title: User Entity
Author: Galilea Yanely Vilches Segundo
Date: April 28th, 2025
*/
package com.rev.songs.model;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "user_data")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userId")
    private Long userId;

    @Column(name = "userName", unique = true, length = 100, nullable = false)
    private String userName;

    @Column(name = "email", unique = true, length = 100, nullable = false)
    private String email;

    @Column(name = "password", unique = true, length = 100, nullable = false)
    private String password;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Song> songsByUser = new ArrayList<>();

    public User(){

    }

    public User(Long userId, String userName, String email, String password, List<Song> songsByUser){
        this.userId = userId;
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.songsByUser = songsByUser;
    }

    public Long getUserId(){
        return userId;
    }

    public void setUserId(Long id){
        this.userId = userId;
    }

    public String getUserName(){
        return userName;
    }

    public void setUserName(String userName){
        this.userName = userName;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public List<Song> getSongsByUser(){
        return songsByUser;
    }

    public void setSongsByUser(List<Song> songsByUser){
        this.songsByUser = songsByUser;
    }

}
