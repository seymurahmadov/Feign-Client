package com.example.aailabtask.service;

import com.example.aailabtask.entity.Customer;
import com.example.aailabtask.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public ArrayList<Customer> getCustomer(){
       return customerRepository.findAll();
    }
}
