package com.example.aailabtask.service;

import com.example.aailabtask.entity.Order;
import com.example.aailabtask.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class OrderService {
    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public ArrayList<Order> getProductsOfCustomer(int customerId){
        return orderRepository.findAllByCustomerId(customerId);
    }
}