package com.pixel.hotelroomreservationsystem.controller;

import com.pixel.hotelroomreservationsystem.entity.Booking;
import com.pixel.hotelroomreservationsystem.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookingController {
    @Autowired
    public BookingRepository bookingRepository;

    @PostMapping("registration/booking")
    public Booking createBooking(@RequestBody Booking booking){
        return bookingRepository.save(booking);
    }
}
