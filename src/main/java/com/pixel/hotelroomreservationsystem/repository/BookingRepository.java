package com.pixel.hotelroomreservationsystem.repository;

import com.pixel.hotelroomreservationsystem.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking,Long>{

}