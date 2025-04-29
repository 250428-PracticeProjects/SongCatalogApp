/*
Title: Song Entity
Author: Galilea Yanely Vilches Segundo
Date: April 28th, 2025
*/
package com.rev.songs.model;

import jakarta.persistence.*;

@Entity
@Table(name = "song_data")
public class Song {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "songId")
    private Long songId;

    @Column(name = "songName", length = 100, nullable = false)
    private String songName;

    @Column(name = "genre", length = 50, nullable = false)
    private String genre;

    @ManyToOne
    @JoinColumn(name = "artistId", nullable = false)
    private Artist artist;

    @ManyToOne
    @JoinColumn(name = "albumId", nullable = false)
    private Album album;

    @ManyToOne
    @JoinColumn(name = "userId", nullable = false)
    private User user;

    public Song(){

    }

    public Song(Long songId, String songName, String genre, Artist artist, Album album, User user){
        this.songId = songId;
        this.songName = songName;
        this.genre = genre;
        this.artist = artist;
        this.album = album;
        this.user = user;
    }

    public Long getSongId(){
        return songId;
    }
    public void setSongId(Long songId){
        this.songId = songId;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public User getUser(){
        return user;
    }

    public void setUser(User user){
        this.user = user;
    }

    @Override
    public String toString(){
        return "Song:\n" +
                "\tID: " + songId + "\n" +
                "\tName: " + songName + "\n" +
                "\tGenre: " + genre + "\n" +
                "\tArtist: " + artist + "\n" +
                "\tAlbum: " + album + "\n";
    }
}
