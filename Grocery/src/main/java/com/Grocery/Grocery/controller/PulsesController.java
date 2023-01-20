package com.Grocery.Grocery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Grocery.Grocery.model.Cart;
import com.Grocery.Grocery.model.Pulses;
import com.Grocery.Grocery.repository.CartRepository;
import com.Grocery.Grocery.repository.PulsesRepository;

@RestController
@RequestMapping("/pulses")
public class PulsesController {

	@Autowired
	private PulsesRepository pulsesRepository;
	
	@GetMapping
	public List<Pulses> getAllPulses(){
		return pulsesRepository.findAll();
	}
}
