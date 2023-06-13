package com.example.aailabtask.repository;

import com.example.aailabtask.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {
    ArrayList<Customer> findAll();
}
