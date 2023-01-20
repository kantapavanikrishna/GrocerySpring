package com.Grocery.Grocery.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.Grocery.Grocery.model.User;


@Repository

public interface GroceryRepository extends JpaRepository<User, Integer> {

	

//	User findById(int id);
//	List<User>deleteById(int id);
	List<User> findByEmail(String email);
}
