package com.pixel.hotelroomreservationsystem.controller;

import com.pixel.hotelroomreservationsystem.entity.Users;
import com.pixel.hotelroomreservationsystem.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    private UsersService usersService;

    @GetMapping("/user/all")
    public List<Users> getAllUsers(){
        return usersService.getAllUsers();
    }

    @GetMapping("/user/{id}")
    public Optional<Users> getUserById(@PathVariable("id") Long id){
        return usersService.getUserById(id);
    }
}
