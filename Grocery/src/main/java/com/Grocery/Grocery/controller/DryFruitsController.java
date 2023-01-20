package com.Grocery.Grocery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Grocery.Grocery.model.Category;
import com.Grocery.Grocery.model.DryFruits;
import com.Grocery.Grocery.repository.CategoryRepository;
import com.Grocery.Grocery.repository.DryFruitsRepository;

@RestController
@RequestMapping("/dry")
public class DryFruitsController {

	@Autowired
	private DryFruitsRepository dryfruitsRepository;
	
	
	
	@GetMapping
    public List<DryFruits> getAllDryFruits()
    {
        return dryfruitsRepository.findAll();
    }
}
