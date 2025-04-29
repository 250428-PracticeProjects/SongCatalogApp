/*
Title: Song Controller
Author: Galilea Yanely Vilches Segundo
Date: April 28th, 2025
*/

package com.rev.songs.controller;

import com.rev.songs.model.Song;
import com.rev.songs.service.SongService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/songs")
public class SongController {

    private final SongService songService;

    public SongController(SongService songService){
        this.songService = songService;
    }

    @PostMapping("/create")
    public Song createSong(@RequestBody Song song) {
        return songService.saveSong(song);
    }

    @GetMapping("/allSongs")
    public List<Song> getAllSongs() {
        return songService.getAllSongs();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Song> getSongById(@PathVariable Long id) {
        return songService.getSongById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

}
