/*
Title: User Controller
Author: Galilea Yanely Vilches Segundo
Date: April 28th, 2025
*/
package com.rev.songs.controller;

import com.rev.songs.model.User;
import com.rev.songs.repository.UserRepository;
import com.rev.songs.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;
    private final UserRepository userRepository;

    public UserController(UserService userService, UserRepository userRepository){
        this.userService = userService;
        this.userRepository = userRepository;
    }

    @PostMapping("/register")
    public ResponseEntity<User> registerUser(@RequestBody User user) {
        if (userRepository.findById(user.getUserId()) != null) {
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }
        user.setPassword(user.getPassword());
        return ResponseEntity.ok(userRepository.save(user));
    }

}
