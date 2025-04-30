/*
 *
 * Title: Artist Repository Interface
 * Author: Galilea Yanely Vilches Segundo
 * Date: April 30th, 2025
 *
 */
package com.rev.songs.repositories;

//Libraries
import com.rev.songs.entities.Artist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtistRepository extends JpaRepository<Artist, Long>{
}
