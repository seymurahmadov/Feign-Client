package com.example.aailabtask.repository;

import com.example.aailabtask.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface OrderRepository extends JpaRepository<Order,Long> {
    ArrayList<Order> findAllByCustomerId(int customerId);


//    @Query("SELECT p FROM Product p WHERE p.name LIKE ?1 AND p.brand LIKE ?2")
//    List<Product> findByNameAndBrand(String name, String brand);
}

