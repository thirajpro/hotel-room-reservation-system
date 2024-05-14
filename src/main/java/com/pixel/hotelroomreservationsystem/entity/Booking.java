package com.pixel.hotelroomreservationsystem.entity;

import jakarta.persistence.*;

@Entity
@Table
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

}
