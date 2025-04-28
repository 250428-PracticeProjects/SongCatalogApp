/*
Title: Album Service Interface
Author: Galilea Yanely Vilches Segundo
Date: April 28th, 2025
*/
package com.rev.songs.service;

import com.rev.songs.model.Album;
import java.util.List;
import java.util.Optional;

public interface AlbumServiceInt {

    public List<Album> getAllAlbums();
    public Optional<Album> getAlbumById();
    public Album saveAlbum(Album album);
}
