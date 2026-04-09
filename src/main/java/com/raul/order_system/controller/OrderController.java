package com.raul.order_system.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @PostMapping
    public String createOrder() {
        return "Order Created";
    }

    @GetMapping("/{id}")
    public String getOrder(@PathVariable String id) {
        return "Order " + id;
    }
}
