package com.Grocery.Grocery.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Grocery.Grocery.model.Login;

public interface LoginRepository extends JpaRepository<Login, String>{

	Login findByUsername(String username);
}
