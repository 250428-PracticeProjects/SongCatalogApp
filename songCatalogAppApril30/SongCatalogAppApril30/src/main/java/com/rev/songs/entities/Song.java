/*
 *
 * Title: Song Entity
 * Author: Galilea Yanely Vilches Segundo
 * Date: April 30th, 2025
 *
 */
package com.rev.songs.entities;

//Libraries
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "song_data")
public class Song {

    //Marks this column as the primary key
    @Id
    //Indicates that the primary key should be generated automatically
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "songId")
    private Long songId;

    @Column(name = "songTitle", length = 50, nullable = false, unique = true)
    private String songTitle;

    @Column(name = "songGenre", length = 50, nullable = false)
    private String songGenre;

    @ManyToOne
    @JoinColumn(name = "artistId", nullable = false)
    private Artist artist;

    @ManyToOne
    @JoinColumn(name = "albumId", nullable = false)
    private Album album;

    //This helps us create the table for the many to many relationship. This table is called "song_playlist"
    @ManyToMany
    @JoinTable(name = "songPlaylist",
            joinColumns = @JoinColumn(name = "songId"),
            inverseJoinColumns = @JoinColumn(name = "playlistId")
    )
    private List<Playlist> playlists;

    public Song(){

    }

    public Song(Long songId, String songTitle, String songGenre, Artist artist, Album album, List<Playlist> playlists) {
        this.songId = songId;
        this.songTitle = songTitle;
        this.songGenre = songGenre;
        this.artist = artist;
        this.album = album;
        this.playlists = playlists;
    }

    public Long getSongId() {
        return songId;
    }

    public void setSongId(Long songId) {
        this.songId = songId;
    }

    public String getSongTitle() {
        return songTitle;
    }

    public void setSongTitle(String songTitle) {
        this.songTitle = songTitle;
    }

    public String getSongGenre() {
        return songGenre;
    }

    public void setSongGenre(String songGenre) {
        this.songGenre = songGenre;
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

    public List<Playlist> getPlaylists() {
        return playlists;
    }

    public void setPlaylists(List<Playlist> playlists) {
        this.playlists = playlists;
    }

    @Override
    public String toString(){
        return "Song:\n" +
                "\tID: " + songId + "\n" +
                "\tTitle: " + songTitle + "\n" +
                "\tGenre: " + songGenre + "\n" +
                "\tArtist: " + artist + "\n" +
                "\tAlbum: " + album + "\n" +
                "\tPlaylists: " + playlists + "\n";
    }
}