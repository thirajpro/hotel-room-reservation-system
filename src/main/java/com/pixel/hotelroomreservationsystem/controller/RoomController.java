package com.pixel.hotelroomreservationsystem.controller;

import com.pixel.hotelroomreservationsystem.entity.Room;
import com.pixel.hotelroomreservationsystem.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoomController {
    @Autowired
    private RoomRepository roomRepository;

    @PostMapping("registration/room")
    public Room createRoom(@RequestBody Room room){
        return roomRepository.save(room);

    }
}
