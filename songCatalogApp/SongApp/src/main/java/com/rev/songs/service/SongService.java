/*
Title: Song Service
Author: Galilea Yanely Vilches Segundo
Date: April 28th, 2025
*/
package com.rev.songs.service;

import com.rev.songs.model.Song;
import com.rev.songs.repository.SongRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SongService implements SongServiceInt{

    private final SongRepository songRepository;

    public SongService(SongRepository songRepository){
        this.songRepository = songRepository;
    }

    public List<Song> getAllSongs(){
        List<Song> allSongs =  songRepository.findAll();
        return allSongs;
    }

    public Optional<Song> getSongById(Long id){
        Optional<Song> foundedSong = songRepository.findById(id);
        return foundedSong;
    }

    public Song saveSong(Song song){
        Song newSong = songRepository.save(song);
        return newSong;
    }

}
