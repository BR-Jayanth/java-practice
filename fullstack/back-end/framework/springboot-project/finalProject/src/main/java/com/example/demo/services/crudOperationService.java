package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.userStructureSchema;
import com.example.demo.modal.userInfo;

@Service
public class crudOperationService {
	
	@Autowired
	private userStructureSchema  con;
	
	public String addUser(userInfo user) {
		//store user details to database
		con.save(user);
		
		return "user info saved successfully";
	}
	
    public List<userInfo> getUser() {
    	//returns all user
    	List<userInfo> data=con.findAll();
    	return data;
    }
   public String checkUser(userInfo user) {
		
//		List<userInfo> data=con.findAll();
//		System.out.println(data.); 
	  String msg="";
		
		  var data = con.findById(user.getEmail()).orElse(null);
		   System.out.println(data+data.getEmail());
		   if(data !=null) {
			   if(data.getPassword().equals(user.getPassword())) {
				   msg="sucessfully loged in";
				   System.out.println(msg);
				   
			   }
			   else {
				   msg="incorrect password";
				   System.out.println(msg);
			   }
		   }else {
			   msg="user not found";
			   System.out.println(msg);
		   }
		
		return msg;
	}

}
