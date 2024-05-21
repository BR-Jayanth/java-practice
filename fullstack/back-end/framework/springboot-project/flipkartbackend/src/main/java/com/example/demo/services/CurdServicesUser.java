package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.StudentStructureSchemaofDb;
import com.example.demo.modal.StudentInfo;

@Service
public class CurdServicesUser {
	@Autowired
	private StudentStructureSchemaofDb con;
   public void addUser(StudentInfo user) {
//	   user.setNo(1);
//	   user.setName("A");
//	   user.setChocolate("C");
	   
//	   con.saveAll(user);
	   con.save(user);
	   
   }
   
   public void deleteUser(StudentInfo user) {
	   user.setNo(0);
	   con.delete(user);
	   
   }
 public void updateUser(StudentInfo user) {
//	   user.setNo(1);
	   var data = con.findById(user.getNo()).orElse(null);
	   System.out.println(data+data.getName());
	   if(data !=null) {
		   
		   data.setName(user.getName());
		   data.setChocolate(user.getChocolate());
		   con.save(data);
	   }else {
		   System.out.println("no user found");
	   }
	   
   }
 public void readUser(StudentInfo user) {
	 List<StudentInfo> all=  con.findAll();
	 System.out.println(all);
	 all.forEach((e)->{
		 System.out.println(e.getNo());
		 System.out.println(e.getName());

		 System.out.println(e.getChocolate());
	 });
 }
}
