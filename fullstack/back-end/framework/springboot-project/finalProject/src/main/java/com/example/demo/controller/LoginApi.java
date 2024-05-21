package com.example.demo.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modal.userInfo;
import com.example.demo.services.crudOperationService;

@RestController
@CrossOrigin
public class LoginApi {
	@Autowired
	public crudOperationService service;
	
	@PostMapping("/api/login-email")
	public String login_email ( String email,String password) {
		userInfo userData=new  userInfo();  
		
	    
		System.out.println(email +" "+ password);
		userData.setEmail(email);
		userData.setPassword(password);
		return  service.checkUser(userData);	
		
//		String  email1="abc@email.com";
//	    String   pasword1="123";
//		if(email1.contentEquals(email)) {
//			ArrayList data= new ArrayList();
//			data.add(email1);
//			data.add(pasword1);
//			
//		}else {
//			ArrayList data= new ArrayList();
//			data.add("wrong password");
//			
//			return "wrongPassword";
//			
//		}
		
		
//		return "working";
	}

}
