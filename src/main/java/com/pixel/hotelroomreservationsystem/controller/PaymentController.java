package com.pixel.hotelroomreservationsystem.controller;

import com.pixel.hotelroomreservationsystem.entity.Payment;
import com.pixel.hotelroomreservationsystem.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @PostMapping("/payment/new")
    public String createPayment(@RequestBody Payment payment){
        paymentService.createPayment(payment);
        return "Payment Done!";
    }
}
