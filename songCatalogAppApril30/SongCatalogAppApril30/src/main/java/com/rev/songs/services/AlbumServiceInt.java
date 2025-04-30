/*
 *
 * Title: Artist Service Interface
 * Author: Galilea Yanely Vilches Segundo
 * Date: April 30th, 2025
 *
 */
package com.rev.songs.services;

//Libraries
import com.rev.songs.entities.Album;
import java.util.List;
import java.util.Optional;


public interface AlbumServiceInt {
    public Album createAlbum(Long artistId, Album album);
    //public Album updateAlbum(Long albumId, Album album);
    public List<Album> getAllAlbums();
    public Optional<Album> getAlbumById(Long id);
    //public List<Album> getAlbumByArtist(Long artistId);
}
