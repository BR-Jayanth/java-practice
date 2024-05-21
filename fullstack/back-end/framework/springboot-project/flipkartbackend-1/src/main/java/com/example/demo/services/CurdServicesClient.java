package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ClientStructureSchema;

import com.example.demo.modal.client;

@Service
public class CurdServicesClient {
	 
	@Autowired
	private ClientStructureSchema con;

	public String addClient(client user) {
		
		con.save(user);
		
		return "saved";
	}
	
public String deleteClient(client user) {
		user.setNumber(1);
		con.delete(user);
		
		return "saved";
	}
public void readClient(client user) {
	
	 List<client> all=  con.findAll();
	 System.out.println(all);
	 all.forEach((e)->{
		 System.out.println(e.getNumber());
		 System.out.println(e.getName());

//		 System.out.println(e.getChocolate());
	 });
}
}
