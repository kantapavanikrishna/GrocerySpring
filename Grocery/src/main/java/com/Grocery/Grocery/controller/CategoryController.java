package com.Grocery.Grocery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Grocery.Grocery.model.Category;
import com.Grocery.Grocery.model.User;
import com.Grocery.Grocery.repository.CategoryRepository;


@RestController
@RequestMapping("/category")
public class CategoryController {

	@Autowired
	private CategoryRepository categoryRepository;
	
	
	
	@GetMapping
    public List<Category> getAllCategory()
    {
        return categoryRepository.findAll();
    }
 
}
