/*
 *
 * Title: Playlist Service Interface
 * Author: Galilea Yanely Vilches Segundo
 * Date: April 30th, 2025
 *
 */
package com.rev.songs.services;

//Libraries
import com.rev.songs.entities.Playlist;
import java.util.List;

public interface PlaylistServiceInt {
    public Playlist createPlaylist(Long userId, Playlist playlist);
    public Playlist addSongToPlaylist(Long playlistId, Long songId);
    public List<Playlist> getAllPlaylists();
}
