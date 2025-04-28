/*
Title: Artist Entity
Author: Galilea Yanely Vilches Segundo
Date: April 28th, 2025
*/

package com.rev.songs.model;

import jakarta.persistence.*;
import java.util.List;
import java.util.ArrayList;

@Entity
@Table(name = "artist_data")
public class Artist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "artistId")
    private Long artistId;

    @Column(name = "artistName", unique = true, length = 100, nullable = false)
    private String artistName;

    @OneToMany(mappedBy = "artist", cascade = CascadeType.ALL)
    private List<Song> songs = new ArrayList<>();

    public Artist(){

    }

    public Artist(Long artistId, String artistName, List<Song> songs){
        this.artistId = artistId;
        this.artistName = artistName;
        this.songs = songs;
    }

    public Long getArtistId() {
        return artistId;
    }

    public void setArtistId(Long artistId) {
        this.artistId = artistId;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }

    @Override
    public String toString(){
        return "Artist:\n" +
                "\tID: " + artistId + "\n" +
                "\tName: " + artistName + "\n";
    }

}
