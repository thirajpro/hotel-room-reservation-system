package com.pixel.hotelroomreservationsystem.controller;

import com.pixel.hotelroomreservationsystem.entity.Users;
import com.pixel.hotelroomreservationsystem.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRegistrationController {
    @Autowired
    private UsersRepository usersRepository;
//    @Autowired
//    private PasswordEncoder passwordEncoder;
    @PostMapping("/registration/user")
    public Users createUser(@RequestBody Users user){
//        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return usersRepository.save(user);

    }
}
