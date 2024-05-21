package com.pixel.hotelroomreservationsystem.controller;

import com.pixel.hotelroomreservationsystem.entity.Users;
import com.pixel.hotelroomreservationsystem.repository.UsersRepository;
import com.pixel.hotelroomreservationsystem.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserRegistrationController {
    //dependency injection
    @Autowired
    private UsersService usersService;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private UsersRepository usersRepository;

    //Create a new user
    @PostMapping("/register/user")
    public Users createUser(@RequestBody Users user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return usersRepository.save(user);
    }


}
