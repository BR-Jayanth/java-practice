package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modal.client;
import com.example.demo.services.CurdServicesClient;

//import ch.qos.logback.core.net.server.Client;

@RestController
@CrossOrigin
public class CurdOperationWithClient {

	@Autowired
	private CurdServicesClient service;
	
	@GetMapping ("/api/addClient")
	public String addUser(client user) {
		service.addClient(user);
		return "saved";
		
	}
	@GetMapping ("/api/readClient")
	public String readUser(client user) {
		 System.out.println(user.getNumber());
		 System.out.println(user.getName());

		service.readClient(user);
		return "read";
		
	}
	
	@DeleteMapping ("/api/deleteClient")
	public String deleteUser(client user) {
		service.deleteClient(user);
		return "deleted";
		
	}
	
	
}
