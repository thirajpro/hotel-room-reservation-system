package com.pixel.hotelroomreservationsystem.service;

import com.pixel.hotelroomreservationsystem.entity.Payment;
import com.pixel.hotelroomreservationsystem.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    public Payment createPayment(Payment payment){
        return paymentRepository.save(payment);
    }
}
