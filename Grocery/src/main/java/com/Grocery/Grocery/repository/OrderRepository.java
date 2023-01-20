package com.Grocery.Grocery.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Grocery.Grocery.model.Orders;

@Repository
public interface OrderRepository extends JpaRepository<Orders, Integer> {

}
