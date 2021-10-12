package com.example.cloud.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CallBackController {

    @GetMapping(value = "/productServiceFallBack")
    public String productServiceFallback()
    {
        String msg="<h2 style='color:red;text-align:center'>ProductService is Down,Please Try Again Later</h2>";
        return msg;
    }

    @GetMapping(value = "/paymentServiceFallBack")
    public String paymentServiceFallback()
    {
        String msg="<h2 style='color:red;text-align:center'>Payment Service is Down,Please Try Again Later</h2>";
        return msg;
    }
}
