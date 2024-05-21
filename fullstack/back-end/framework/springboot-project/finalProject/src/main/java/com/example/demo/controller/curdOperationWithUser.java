package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modal.userInfo;
import com.example.demo.services.crudOperationService;

@RestController
@CrossOrigin
public class curdOperationWithUser {
	
	@Autowired
	public crudOperationService service;
	
	@GetMapping("/api/addUser")
	public String addUser(userInfo user) {
		service.addUser(user);
		
		return"saved";
	}
	@GetMapping("/api/login")
	public String checkUser(userInfo user) {
		String ret =service.checkUser(user);
		
		return ret;
	}

}
