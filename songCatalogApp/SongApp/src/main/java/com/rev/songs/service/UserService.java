/*
Title: User Service
Author: Galilea Yanely Vilches Segundo
Date: April 28th, 2025
*/

package com.rev.songs.service;

import com.rev.songs.model.User;
import com.rev.songs.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserServiceInt{

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public User createUser(User user){
        User provUser = new User();
        provUser.setUserName(user.getUserName());
        provUser.setEmail(user.getEmail());
        provUser.setPassword(user.getPassword());
        User nwUser = userRepository.save(provUser);
        return nwUser;
    }

}
