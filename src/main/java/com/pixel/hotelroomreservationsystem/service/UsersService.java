package com.pixel.hotelroomreservationsystem.service;

import com.pixel.hotelroomreservationsystem.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersService {

    @Autowired
    private UsersRepository usersRepository;

}
