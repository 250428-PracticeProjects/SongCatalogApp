/*
 *
 * Title: Artist Service Interface
 * Author: Galilea Yanely Vilches Segundo
 * Date: April 29th, 2025
 *
 */
package com.rev.songs.services;

//Libraries
import com.rev.songs.entities.Artist;
import java.util.List;
import java.util.Optional;


public interface ArtistServiceInt {
    public Artist createArtist(Artist artist);
    //public Artist updateArtist(Long artistId, Artist artist);
    public List<Artist> getAllArtist();
    public Optional<Artist> getArtistById(Long id);
    //public Artist getArtistByName(String name);
}
