/*
 *
 * Title: Artist Service
 * Author: Galilea Yanely Vilches Segundo
 * Date: April 30th, 2025
 *
 */
package com.rev.songs.services;

//Libraries
import com.rev.songs.entities.Artist;
import com.rev.songs.repositories.ArtistRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class ArtistService implements ArtistServiceInt{
    private final ArtistRepository artistRepository;

    public ArtistService(ArtistRepository artistRepository) {
        this.artistRepository = artistRepository;
    }

    @Override
    public Artist createArtist(Artist artist) {
        if(artist != null){
            return artistRepository.save(artist);
        }else return null;
    }

    @Override
    public List<Artist> getAllArtist() {
        List<Artist> allArtist = artistRepository.findAll();
        return allArtist;
    }

    @Override
    public Optional<Artist> getArtistById(Long artistId) {
        Optional<Artist> foundArtist = artistRepository.findById(artistId);
        return foundArtist;
    }
}
