/*
 *
 * Title: Playlist Entity
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
@Table(name = "playlist_data")
public class Playlist {

    //Marks this column as the primary key
    @Id
    //Indicates that the primary key should be generated automatically
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "playlistId")
    private Long playlistId;

    @Column(name = "playlistTitle", length = 50, nullable = false)
    private String playlistTitle;

    @Column(name = "playlistDescription", length = 100, nullable = false)
    private String songTitle;

    @ManyToMany(mappedBy = "playlists")
    private List<Song> songs = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "userId", nullable = false)
    private User createdBy;

    public Playlist() {
    }

    public Playlist(Long playlistId, String playlistTitle, String songTitle, List<Song> songs, User createdBy) {
        this.playlistId = playlistId;
        this.playlistTitle = playlistTitle;
        this.songTitle = songTitle;
        this.songs = songs;
        this.createdBy = createdBy;
    }

    public Long getPlaylistId() {
        return playlistId;
    }

    public void setPlaylistId(Long playlistId) {
        this.playlistId = playlistId;
    }

    public String getPlaylistTitle() {
        return playlistTitle;
    }

    public void setPlaylistTitle(String playlistTitle) {
        this.playlistTitle = playlistTitle;
    }

    public String getSongTitle() {
        return songTitle;
    }

    public void setSongTitle(String songTitle) {
        this.songTitle = songTitle;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }

    public User getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(User createdBy) {
        this.createdBy = createdBy;
    }

    @Override
    public String toString() {
        return "Playlist{" +
                "playlistId=" + playlistId +
                ", playlistTitle='" + playlistTitle + '\'' +
                ", songTitle='" + songTitle + '\'' +
                ", songs=" + songs +
                ", createdBy=" + createdBy +
                '}';
    }
}
