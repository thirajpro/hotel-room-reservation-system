package com.pixel.hotelroomreservationsystem.repository;

import com.pixel.hotelroomreservationsystem.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment,Long> {
}
