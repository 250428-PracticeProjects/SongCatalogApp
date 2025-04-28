/*
Title: Song Service Interface
Author: Galilea Yanely Vilches Segundo
Date: April 28th, 2025
*/

package com.rev.songs.service;

import com.rev.songs.model.Song;
import java.util.List;
import java.util.Optional;

public interface SongServiceInt {

    public List<Song> getAllSongs();
    public Optional<Song> getSongById(Long id);
    public Song saveSong(Song song);
}
