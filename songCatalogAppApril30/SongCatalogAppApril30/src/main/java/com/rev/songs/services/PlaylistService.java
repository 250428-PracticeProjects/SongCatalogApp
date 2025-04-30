/*
 *
 * Title: Playlist Service
 * Author: Galilea Yanely Vilches Segundo
 * Date: April 30th, 2025
 *
 */
package com.rev.songs.services;

//Libraries
import com.rev.songs.entities.Playlist;
import com.rev.songs.entities.User;
import com.rev.songs.entities.Song;
import com.rev.songs.repositories.PlaylistRepository;
import com.rev.songs.repositories.UserRepository;
import com.rev.songs.repositories.SongRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlaylistService implements PlaylistServiceInt{

    private final PlaylistRepository playlistRepository;
    private final UserRepository userRepository;
    private final SongRepository songRepository;

    public PlaylistService(PlaylistRepository playlistRepository, UserRepository userRepository, SongRepository songRepository) {
        this.playlistRepository = playlistRepository;
        this.userRepository = userRepository;
        this.songRepository = songRepository;
    }

    @Override
    public Playlist createPlaylist(Long userId, Playlist playlist) {
        User user = userRepository.findById(userId).orElse(null);
        if(user != null){
            playlist.setCreatedBy(user);
            return playlistRepository.save(playlist);
        }else return null;
    }

    @Override
    public Playlist addSongToPlaylist(Long playlistId, Long songId) {
        Playlist foundPlaylist = playlistRepository.findById(playlistId).orElse(null);
        Song foundSong = songRepository.findById(songId).orElse(null);
        foundPlaylist.getSongs().add(foundSong);
        return playlistRepository.save(foundPlaylist);
    }

    @Override
    public List<Playlist> getAllPlaylists() {
        List<Playlist> allPlaylists = playlistRepository.findAll();
        return allPlaylists;
    }
}
