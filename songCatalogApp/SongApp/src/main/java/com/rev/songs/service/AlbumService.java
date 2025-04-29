/*
Title: Album Service
Author: Galilea Yanely Vilches Segundo
Date: April 28th, 2025
*/
package com.rev.songs.service;

import com.rev.songs.model.Album;
import com.rev.songs.repository.AlbumRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlbumService implements AlbumServiceInt{

    private final AlbumRepository albumRepository;

    public AlbumService(AlbumRepository albumRepository){
        this.albumRepository = albumRepository;
    }

    public List<Album> getAllAlbums(){
        List<Album> allAlbums =  albumRepository.findAll();
        return allAlbums;
    }

    public Optional<Album> getAlbumById(Long id){
        Optional<Album> foundedAlbum = albumRepository.findById(id);
        return foundedAlbum;
    }

    public Album saveAlbum(Album album){
        Album newAlbum = albumRepository.save(album);
        return newAlbum;
    }
}
