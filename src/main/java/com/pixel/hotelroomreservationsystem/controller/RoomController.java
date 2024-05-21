package com.pixel.hotelroomreservationsystem.controller;

import com.pixel.hotelroomreservationsystem.entity.Room;
import com.pixel.hotelroomreservationsystem.repository.RoomRepository;
import com.pixel.hotelroomreservationsystem.service.RoomService;
import com.pixel.hotelroomreservationsystem.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class RoomController {

    //RoomRepository dependency injection
    @Autowired
    private RoomService roomService;
    @Autowired
    private UsersService usersService;
    @Autowired
    private RoomRepository roomRepository;

    //Create a new room
    @PostMapping("/room/register")
    public Room createRoom(@RequestBody Room room){
       return roomService.createRoom(room);
    }

    //Get room by id
    @GetMapping("/room/{id}")
    public Optional<Room> getRoomById(@PathVariable("id") Long id){
        return roomService.getRoomById(id);
    }

    //Retrieve all room
    @GetMapping("/room/all")
    public List<Room> getAllRoom(){
        return roomService.getAllRoom();
    }
    //Delete room by id
    @DeleteMapping("/room/delete/{id}")
    public String deleteRoomById(@PathVariable("id") Long id){
        roomService.deleteRoomById(id);
        return id + " " + "has deleted successfully";
    }

    //Delete all room
    @DeleteMapping("/room/delete/all")
    public String deleteAllRoom(){
        roomService.deleteAllRoom();
        return "ALl rooms deleted";
    }

}
