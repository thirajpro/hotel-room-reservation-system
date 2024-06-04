package com.pixel.hotelroomreservationsystem.service;

import com.pixel.hotelroomreservationsystem.entity.Room;
import com.pixel.hotelroomreservationsystem.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

//Room Service class for handling all Room functions
@Service
public class RoomService {

    //RoomRepository dependency injection
    @Autowired
    private RoomRepository roomRepository;

    //Create new room
    public Room createRoom(Room room){
        return roomRepository.save(room);
    }

    //Retrieve room by id
    public Optional<Room> getRoomById(Long id){
        return roomRepository.findById(id);
    }

    //Retrieve all room
    public List<Room> getAllRoom(){
        return roomRepository.findAll();
    }

    //Delete room by id
    public void deleteRoomById(Long id){
        roomRepository.deleteById(id);
    }

    //Delete all room
    public void deleteAllRoom(){
        roomRepository.deleteAll();
    }

}
