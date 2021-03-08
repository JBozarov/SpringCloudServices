package com.example.demo.contorller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    public String payNow(int price) {
        return "Payment successful and the price is " + price;
    } 
}
