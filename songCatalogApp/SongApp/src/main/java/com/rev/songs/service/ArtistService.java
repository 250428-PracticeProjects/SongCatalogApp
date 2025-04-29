/*
Title: Artist Service
Author: Galilea Yanely Vilches Segundo
Date: April 28th, 2025
*/

package com.rev.songs.service;

import com.rev.songs.model.Artist;
import com.rev.songs.repository.ArtistRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArtistService implements ArtistServiceInt{

    private final ArtistRepository artistRepository;

    public ArtistService(ArtistRepository artistRepository){
        this.artistRepository = artistRepository;
    }

    public List<Artist> getAllArtist(){
        List<Artist> allArtists = artistRepository.findAll();
        return allArtists;
    }
    public Optional<Artist> getArtistById(Long id){
        Optional<Artist> foundedArtist = artistRepository.findById(id);
        return foundedArtist;
    }
    public Artist saveArtist(Artist artist){
        Artist newArtist = artistRepository.save(artist);
        return newArtist;
    }

}
