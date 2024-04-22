package com.pixel.hotelroomreservationsystem.repository;

import com.pixel.hotelroomreservationsystem.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room,Long> {
}
