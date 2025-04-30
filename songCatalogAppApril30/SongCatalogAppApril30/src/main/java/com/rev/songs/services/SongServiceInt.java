/*
 *
 * Title: Song Service Interface
 * Author: Galilea Yanely Vilches Segundo
 * Date: April 30th, 2025
 *
 */
package com.rev.songs.services;

//Libraries
import com.rev.songs.entities.Song;
import java.util.List;
import java.util.Optional;

public interface SongServiceInt {
    public Song createSong(Song song, Long artistId);
    //public Song updateSong(Long songId, Song song);
    public List<Song> getAllSongs();
    public Optional<Song> getSongById(Long id);
    //public List<Song> getSongsByArtist(Long artistId);
    //public List<Song> getSongsByGenre(String genre);
}
