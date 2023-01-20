package com.Grocery.Grocery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Grocery.Grocery.model.Pulses;

@Repository
public interface PulsesRepository extends JpaRepository<Pulses, Integer>{

}
