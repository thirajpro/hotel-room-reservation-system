package com.pixel.hotelroomreservationsystem.controller;

import com.pixel.hotelroomreservationsystem.entity.Users;
import com.pixel.hotelroomreservationsystem.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

//Rest Controller for User retrieve, Update and Delete
@RestController
public class UserController {

    //Users Service dependency injection
    @Autowired
    private UsersService usersService;

    //User detail service dependency injection
    @Autowired
    private UserDetailsService userDetailsService;

    //Get all users
    @GetMapping("/user/all")
    public List<Users> getAllUsers(){
        return usersService.getAllUsers();
    }

    //Get user by id
    @GetMapping("/user/{id}")
    public Optional<Users> getUserById(@PathVariable("id") Long id){
        return usersService.getUserById(id);
    }

    //Delete user by id
    @DeleteMapping("/user/delete/{id}")
    public String deleteUserById(@PathVariable("id") Long id){
        Users userDelete = new Users();
        usersService.deleteUserById(id);
        return id + " "+ "has deleted successfully";
    }

    //Delete all users
    @DeleteMapping("/user/delete/all")
    public String deleteAllUsers(){
        usersService.deleteAllUsers();
        return "All users deleted successfully";
    }
}
