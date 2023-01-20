package com.Grocery.Grocery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Grocery.Grocery.model.Login;
import com.Grocery.Grocery.repository.LoginRepository;



@RestController
@RequestMapping
public class LoginController {
	 @Autowired
	 	private LoginRepository loginRepository;

	@PostMapping("/welcome")
    public Login getWelcome(@RequestBody Login login) {
        String username = login.getUsername();
        String password = login.getPassword();
        
        Login findByUsername = loginRepository.findByUsername(username);

        
        
        boolean status;
       

        if(findByUsername != null) {
            if(password.equals(findByUsername.getPassword())) {
                status = true;
            }
            else {
                status = false;
            }
        }
        else {
            status = false;
        }

        if(status) {
            //return "Login Successful";
            return findByUsername;
        }
        else {
            return null;
        }
	}
}
