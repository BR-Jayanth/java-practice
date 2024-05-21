package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modal.userInfo;
import com.example.demo.services.crudOperationService;

@RestController
@CrossOrigin
public class RegisterApi {
	
	@Autowired
	public crudOperationService service;
	
	@GetMapping("/api/register")
	public String  registerUser(userInfo user){
		
		service.addUser(user);
		return "success";
		
	}

}
