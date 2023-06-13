package com.example.aailabtask.controller;


import com.example.aailabtask.entity.Order;
import com.example.aailabtask.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderService customerService;

    public OrderController(OrderService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/{customerId}")
    public ArrayList<Order> getOrderByCustomerId(@PathVariable int customerId){
        return customerService.getProductsOfCustomer(customerId);
    }

}
