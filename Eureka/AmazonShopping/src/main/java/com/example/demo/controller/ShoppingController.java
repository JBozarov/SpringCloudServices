package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ShoppingController {

    @Autowired
    private RestTemplate template;

    @RequestMapping("/amazon-payment")
    public String invokePaymentService(@PathVariable int price) {

        // traditional approach:
        //String url = "http://localhost/8888/payment-provider/payNow" + price;

        String url = "http://PAYMENT-SERVICE/payment-provider/payNow" + price;

        return template.getForObject(url, String.class);
    }
}
