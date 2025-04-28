/*
Title: Artist Service Interface
Author: Galilea Yanely Vilches Segundo
Date: April 28th, 2025
*/

package com.rev.songs.service;

import com.rev.songs.model.Artist;
import java.util.List;
import java.util.Optional;

public interface ArtistServiceInt {

    public List<Artist> getAllArtist();
    public Optional<Artist> getArtistById(Long id);
    public Artist saveArtist(Artist artist);
}
