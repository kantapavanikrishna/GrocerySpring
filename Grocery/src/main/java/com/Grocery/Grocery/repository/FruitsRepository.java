package com.Grocery.Grocery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Grocery.Grocery.model.Fruits;

@Repository
public interface FruitsRepository extends JpaRepository<Fruits, Integer>{

}
