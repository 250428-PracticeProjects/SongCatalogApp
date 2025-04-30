/*
 *
 * Title: Song Service
 * Author: Galilea Yanely Vilches Segundo
 * Date: April 30th, 2025
 *
 */
package com.rev.songs.services;
import java.util.List;
import java.util.Optional;

//Libraries
import com.rev.songs.entities.Song;
import com.rev.songs.entities.Artist;
import com.rev.songs.repositories.SongRepository;
import com.rev.songs.repositories.ArtistRepository;
import org.springframework.stereotype.Service;

@Service
public class SongService implements SongServiceInt{

    private final SongRepository songRepository;
    private final ArtistRepository artistRepository;

    public SongService(SongRepository songRepository, ArtistRepository artistRepository) {
        this.songRepository = songRepository;
        this.artistRepository = artistRepository;
    }

    @Override
    public Song createSong(Song song, Long artistId) {
        Artist artistSong = artistRepository.findById(artistId).orElse(null);
        if(artistSong != null) {
            song.setArtist(artistSong);
            return songRepository.save(song);
        }else return null;
    }

    @Override
    public List<Song> getAllSongs() {
        List<Song> allSongs = songRepository.findAll();
        return allSongs;
    }

    @Override
    public Optional<Song> getSongById(Long songId) {
        Optional<Song> foundSong = songRepository.findById(songId);
        return foundSong;
    }
}
