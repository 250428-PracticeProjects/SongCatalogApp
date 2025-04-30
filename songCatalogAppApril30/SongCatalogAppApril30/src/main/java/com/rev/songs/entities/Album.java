/*
 *
 * Title: Album Entity
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
@Table(name = "album_data")
public class Album {

    //Marks this column as the primary key
    @Id
    //Indicates that the primary key should be generated automatically
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "albumId")
    private Long albumId;

    @Column(name = "albumTitle", unique = true, length = 100, nullable = false)
    private String albumTitle;

    @ManyToOne
    @JoinColumn(name = "artistId", nullable = false)
    private Artist artist;

    @OneToMany(mappedBy = "album", cascade = CascadeType.ALL)
    private List<Song> songs = new ArrayList<>();

    public Album() {
    }

    public Album(Long albumId, String albumTitle, Artist artist, List<Song> songs) {
        this.albumId = albumId;
        this.albumTitle = albumTitle;
        this.artist = artist;
        this.songs = songs;
    }

    public Long getAlbumId() {
        return albumId;
    }

    public void setAlbumId(Long albumId) {
        this.albumId = albumId;
    }

    public String getAlbumTitle() {
        return albumTitle;
    }

    public void setAlbumTitle(String albumTitle) {
        this.albumTitle = albumTitle;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }

    @Override
    public String toString() {
        return "Album{" +
                "albumId=" + albumId +
                ", albumTitle='" + albumTitle + '\'' +
                ", artist=" + artist +
                ", songs=" + songs +
                '}';
    }
}
