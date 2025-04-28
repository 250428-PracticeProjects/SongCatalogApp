/*
Title: Song Service
Author: Galilea Yanely Vilches Segundo
Date: April 28th, 2025
Working on it
*/
package com.rev.songs.service;

import com.rev.songs.model.Song;
import com.rev.songs.repository.SongRepository;
import com.rev.songs.service.SongServiceInt;
import java.util.List;
import java.util.Optional;

public class SongService {

    private final SongRepository songRepository;

    public SongService(SongRepository songRepository){
        this.songRepository = songRepository;
    }

    public List<Song> getAllSongs(){
        List<Song> allSongs =  songRepository.findAll();
    }

}
