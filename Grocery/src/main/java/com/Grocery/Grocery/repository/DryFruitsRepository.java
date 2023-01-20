package com.Grocery.Grocery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Grocery.Grocery.model.DryFruits;

@Repository
public interface DryFruitsRepository extends JpaRepository<DryFruits, Integer>{

}
