package com.pixel.hotelroomreservationsystem.service;

import com.pixel.hotelroomreservationsystem.entity.Booking;
import com.pixel.hotelroomreservationsystem.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//Booking service
@Service
public class BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    //Create booking
    public Booking createBooking(Booking booking){
       return bookingRepository.save(booking);
    }
}
