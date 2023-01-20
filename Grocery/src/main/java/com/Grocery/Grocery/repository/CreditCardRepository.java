package com.Grocery.Grocery.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Grocery.Grocery.model.CreditCard;

@Repository
public interface CreditCardRepository extends JpaRepository<CreditCard, Integer>{

	List<CreditCard> findByCvv(String cvv);
}
