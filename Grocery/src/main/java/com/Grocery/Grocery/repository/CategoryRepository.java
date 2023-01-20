package com.Grocery.Grocery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Grocery.Grocery.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer>{

}
