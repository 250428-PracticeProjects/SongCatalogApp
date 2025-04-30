/*
 *
 * Title: Album Service
 * Author: Galilea Yanely Vilches Segundo
 * Date: April 30th, 2025
 *
 */
package com.rev.songs.services;

//Libraries
import com.rev.songs.entities.Album;
import com.rev.songs.entities.Artist;
import com.rev.songs.repositories.AlbumRepository;
import com.rev.songs.repositories.ArtistRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class AlbumService implements AlbumServiceInt{

    private final AlbumRepository albumRepository;
    private final ArtistRepository artistRepository;

    public AlbumService(AlbumRepository albumRepository, ArtistRepository artistRepository) {
        this.albumRepository = albumRepository;
        this.artistRepository = artistRepository;
    }

    @Override
    public Album createAlbum(Long artistId, Album album) {
        Artist artistAlbum = artistRepository.findById(artistId).orElse(null);
        if(artistAlbum != null) {
            album.setArtist(artistAlbum);
            return albumRepository.save(album);
        }else return null;
    }

    @Override
    public List<Album> getAllAlbums() {
        List<Album> albums = albumRepository.findAll();
        return albums;
    }

    @Override
    public Optional<Album> getAlbumById(Long albumId) {
       Optional<Album> foundAlbum = albumRepository.findById(albumId);
       return foundAlbum;
    }
}