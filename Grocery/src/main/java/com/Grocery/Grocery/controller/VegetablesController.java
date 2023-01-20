package com.Grocery.Grocery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Grocery.Grocery.model.Category;
import com.Grocery.Grocery.model.Vegetables;
import com.Grocery.Grocery.repository.CategoryRepository;
import com.Grocery.Grocery.repository.VegetablesRepository;


@RestController
@RequestMapping("/veg")
public class VegetablesController {

	@Autowired
	private VegetablesRepository vegetablesRepository;
	
	
	
	@GetMapping
    public List<Vegetables> getAllVegetables()
    {
        return vegetablesRepository.findAll();
    }
	
	 //add new employee rest api
	 @PostMapping("/add")
	 public Vegetables createVegetables(@RequestBody Vegetables vegetables) {
		 return vegetablesRepository.save(vegetables);
	 }
}
