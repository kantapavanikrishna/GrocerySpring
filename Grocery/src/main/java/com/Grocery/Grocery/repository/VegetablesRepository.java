package com.Grocery.Grocery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Grocery.Grocery.model.Vegetables;

@Repository
public interface VegetablesRepository extends JpaRepository<Vegetables, Integer>{

}
