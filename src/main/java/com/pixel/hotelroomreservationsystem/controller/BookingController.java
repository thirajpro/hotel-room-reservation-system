package com.pixel.hotelroomreservationsystem.controller;

import com.pixel.hotelroomreservationsystem.entity.Booking;
import com.pixel.hotelroomreservationsystem.repository.BookingRepository;
import com.pixel.hotelroomreservationsystem.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//Handling the HTTP request regarding booking
@RestController
public class BookingController {
    //Dependency injecting
    @Autowired
    private BookingRepository bookingRepository;

    //Dependency injecting
    @Autowired
    private BookingService bookingService;

    //HTTP method createBooking
    @PostMapping("/booking/register")
    public Booking createBooking(@RequestBody Booking booking){
    return bookingService.createBooking(booking);

    }
}
