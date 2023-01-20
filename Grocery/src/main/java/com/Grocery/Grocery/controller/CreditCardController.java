package com.Grocery.Grocery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.Grocery.Grocery.model.CreditCard;
import com.Grocery.Grocery.model.Orders;
import com.Grocery.Grocery.model.User;
import com.Grocery.Grocery.repository.CreditCardRepository;
import com.Grocery.Grocery.repository.OrderRepository;

@RestController
@RequestMapping("/creditcard")
public class CreditCardController {

	@Autowired
	private CreditCardRepository creditcardRepository;
	
	private PasswordEncoder passwordEncoder;
	
	@GetMapping
	public List<CreditCard> getAllCreditCard(){
		return creditcardRepository.findAll();
	}
	
	@PostMapping("/add")
	@ResponseBody
	 public CreditCard createEmployee(@RequestBody CreditCard credit) {
		 return creditcardRepository.save(credit);
		 
	 }
	
//	 @PostMapping("/add")
//	    public ResponseEntity<String> registerFarmer(@RequestBody CreditCard credit) {
//	        CreditCard savedFarmers = null;
//	        ResponseEntity response = null;
//	        try {
//	        	String hashPwd=passwordEncoder.encode(credit.getCvv());
//	        	credit.setCvv(hashPwd);
//	            savedFarmers = creditcardRepository.save(credit);
//	            if (savedFarmers.getCredit_id() > 0) {
//	                response = ResponseEntity
//	                        .status(HttpStatus.CREATED)
//	                        .body("Given user details are successfully registered");
//	            }
//	        } catch (Exception ex) {
//	            response = ResponseEntity
//	                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
//	                    .body("An exception occured due to " + ex.getMessage());
//	        }
//	        return response;
//	    }
}
