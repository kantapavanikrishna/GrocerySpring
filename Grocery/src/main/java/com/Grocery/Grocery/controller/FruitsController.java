package com.Grocery.Grocery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Grocery.Grocery.model.Category;
import com.Grocery.Grocery.model.Fruits;
import com.Grocery.Grocery.repository.CategoryRepository;
import com.Grocery.Grocery.repository.FruitsRepository;

@RestController
@RequestMapping("/fruits")
public class FruitsController {

	@Autowired
	private FruitsRepository fruitsRepository;
	
	
	
	@GetMapping
    public List<Fruits> getAllFruits()
    {
        return fruitsRepository.findAll();
    }
}
