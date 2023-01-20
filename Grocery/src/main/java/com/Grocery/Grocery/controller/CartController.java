package com.Grocery.Grocery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Grocery.Grocery.model.Cart;
import com.Grocery.Grocery.model.Orders;
import com.Grocery.Grocery.repository.CartRepository;
import com.Grocery.Grocery.repository.OrderRepository;

@RestController
@RequestMapping("/cart")
public class CartController {

	@Autowired
	private CartRepository cartRepository;
	
	@GetMapping
	public List<Cart> getAllCart(){
		return cartRepository.findAll();
	}
	
	@PostMapping("/add")
	 public Cart createEmployee(@RequestBody Cart cart) {
		 return cartRepository.save(cart);
	 }
}
