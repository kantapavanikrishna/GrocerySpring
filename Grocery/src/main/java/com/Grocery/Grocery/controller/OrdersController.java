package com.Grocery.Grocery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Grocery.Grocery.model.CreditCard;
import com.Grocery.Grocery.model.Orders;
import com.Grocery.Grocery.repository.OrderRepository;

@RestController
@RequestMapping("/orders")
public class OrdersController {

	@Autowired
	private OrderRepository orderRepository;
	
	@GetMapping
	public List<Orders> getAllOrders(){
		return orderRepository.findAll();
	}
	@PostMapping("/add")
	 public Orders createEmployee(@RequestBody Orders order) {
		 return orderRepository.save(order);
	 }
}
