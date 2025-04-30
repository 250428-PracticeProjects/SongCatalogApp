/*
 *
 * Title: Artist Entity
 * Author: Galilea Yanely Vilches Segundo
 * Date: April 30th, 2025
 *
 */
package com.rev.songs.entities;

//Libraries
import jakarta.persistence.*;
import java.util.List;
import java.util.ArrayList;

@Entity
@Table(name = "artist_data")
public class Artist {

    //Marks this column as the primary key
    @Id
    //Indicates that the primary key should be generated automatically
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "artistId")
    private Long artistId;

    @Column(name = "artistName", unique = true, length = 100, nullable = false)
    private String artistName;

    @Column(name = "artistBio", length = 200, nullable = false)
    private String artistBio;

    @OneToMany(mappedBy = "artist", cascade = CascadeType.ALL)
    private List<Song> songs = new ArrayList<>();

    @OneToMany(mappedBy = "artist", cascade = CascadeType.ALL)
    private List<Album> albums = new ArrayList<>();

    public Artist() {
    }

    public Artist(Long artistId, String artistName, List<Song> songs, List<Album> albums, String artistBio) {
        this.artistId = artistId;
        this.artistName = artistName;
        this.songs = songs;
        this.albums = albums;
        this.artistBio = artistBio;
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

    public List<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(List<Album> albums) {
        this.albums = albums;
    }

    public String getArtistBio() {
        return artistBio;
    }

    public void setArtistBio(String artistBio) {
        this.artistBio = artistBio;
    }

    @Override
    public String toString() {
        return "Artist{" +
                "artistId=" + artistId +
                ", artistName='" + artistName + '\'' +
                ", artistBio='" + artistBio + '\'' +
                ", songs=" + songs +
                ", albums=" + albums +
                '}';
    }
}