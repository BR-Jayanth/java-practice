package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modal.StudentInfo;
import com.example.demo.services.CurdServicesUser;

@RestController
@CrossOrigin
public class CurdOperationwithMongoDb {
	@Autowired
	private CurdServicesUser services;
	@GetMapping("/api/save")
    public  String addUserInfo(StudentInfo user1) {
		
		System.out.println("--its--me--"+user1.getName());
		System.out.println("--its--me--"+user1.getChocolate());
		System.out.println("--its--me--"+user1.getName());
		services.addUser(user1);
		return"saved";
	}
	
	@DeleteMapping("/api/delete")
    public  String deleteUserInfo(StudentInfo user1) {
		
		System.out.println("--its--me--"+user1.getName());
		System.out.println("--its--me--"+user1.getChocolate());
		System.out.println("--its--me--"+user1.getName());
		services.deleteUser(user1);
		return"deleted";
	}
	@PutMapping("/api/update")
    public  String updateUserInfo(StudentInfo user1) {
		
		System.out.println("--its--me--"+user1.getName());
		System.out.println("--its--me--"+user1.getChocolate());
		System.out.println("--its--me--"+user1.getName());
		services.updateUser(user1);
		return"updated";
	}
	@GetMapping("/api/read")
    public  String readUserInfo(StudentInfo user1) {
		
		System.out.println("--its--me--"+user1.getName());
		System.out.println("--its--me--"+user1.getChocolate());
		System.out.println("--its--me--"+user1.getName());
		services.readUser(user1);
		return"saved";
	}

}
