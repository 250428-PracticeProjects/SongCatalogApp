/*
Title: User Repostory
Author: Galilea Yanely Vilches Segundo
Date: April 28th, 2025
*/
package com.rev.songs.repository;

import com.rev.songs.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
}
