/*
 *
 * Title: User Service Interface
 * Author: Galilea Yanely Vilches Segundo
 * Date: April 29th, 2025
 *
 */
package com.rev.songs.services;

//Libraries
import com.rev.songs.entities.User;
import java.util.List;
import java.util.Optional;


public interface UserServiceInt {
    public User createUser(User user);
    //public User updateUser(Long userId, User user);
    public List<User> getAllUsers();
    public Optional<User> getUserById(Long id);
    //public User getUserByName(String userName);
}
