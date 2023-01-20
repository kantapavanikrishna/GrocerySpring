package com.Grocery.Grocery.controller;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Grocery.Grocery.model.Login;
import com.Grocery.Grocery.model.Orders;
import com.Grocery.Grocery.model.User;
import com.Grocery.Grocery.model.Vegetables;
import com.Grocery.Grocery.repository.GroceryRepository;
import com.Grocery.Grocery.repository.OrderRepository;




@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Autowired
	private GroceryRepository groceryRepository;
	
	
	
	@GetMapping
    public List<User> getAllUsers()
    {
        return groceryRepository.findAll();
    }
	
//	@PostMapping("/add")
//	 public User addUser(@RequestBody User user) {
//		 return groceryRepository.save(user);
//	 }
	
	 @PostMapping("/add")
	    public ResponseEntity<String> registerUser(@RequestBody User user) {
	        User savedFarmers = null;
	        ResponseEntity response = null;
	        try {
	        	String hashPwd=passwordEncoder.encode(user.getPwd());
	        	user.setPwd(hashPwd);
	            savedFarmers = groceryRepository.save(user);
	            if (savedFarmers.getId() > 0) {
	                response = ResponseEntity
	                        .status(HttpStatus.CREATED)
	                        .body("Given user details are successfully registered");
	            }
	        } catch (Exception ex) {
	            response = ResponseEntity
	                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
	                    .body("An exception occured due to " + ex.getMessage());
	        }
	        return response;
	    }
	 
	 @GetMapping("/{id}")
	 public ResponseEntity getbyid(@PathVariable("id") int id) {
	        return new ResponseEntity(groceryRepository.findById(id), HttpStatus.OK);
	    }
	 
	 @PutMapping("/{id}")
	    public ResponseEntity updateEmployeebyid(@RequestBody User user,@PathVariable("id") int id) {
	        try {
	        	User existfarmers= groceryRepository.findById(id).get();
	        	groceryRepository.save(user);
	            return new ResponseEntity<>(groceryRepository.findById(id),HttpStatus.OK);
	        }catch (NoSuchElementException e) {
	            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	        }}
	
 
//	 @PostMapping("/adduser")
//	 public User createUser(@RequestBody User user) {
//		 return groceryRepository.save(user);
//	 }
//	@PostMapping("/check")
//    public User getWelcome(@RequestBody User user) {
//        String username = user.getEmail();
//        String password = user.getPwd();
//        
//        User findByUsername = (User) groceryRepository.findByEmail(username);
//
//        
//        
//        boolean status;
//       
//
//        if(findByUsername != null) {
//            if(password.equals(findByUsername.getPwd())) {
//                status = true;
//            }
//            else {
//                status = false;
//            }
//        }
//        else {
//            status = false;
//        }
//
//        if(status) {
//            //return "Login Successful";
//            return findByUsername;
//        }
//        else {
//            return null;
//        }
//	}

}
