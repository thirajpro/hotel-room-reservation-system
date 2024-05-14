package com.pixel.hotelroomreservationsystem.repository;

import com.pixel.hotelroomreservationsystem.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends JpaRepository<Payment,Long> {
}
