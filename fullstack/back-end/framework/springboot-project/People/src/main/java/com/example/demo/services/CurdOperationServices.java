package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.teacherStructureSchema;
import com.example.demo.modal.teacher;

@Service
public class CurdOperationServices {
	
	@Autowired
	public teacherStructureSchema  con;
	
	public String addTeacher(teacher t1) {
		
		con.save(t1);
		
		return "teacher added";
		
	}
public String deleteTeacher(teacher t1) {
		
		con.delete(t1);
		
		return "teacher added";
		
	}
public String readTeacher(teacher t1) {
	List<teacher> all =con.findAll();
	all.forEach((record)->{
		System.out.println(record.getNo());
		System.out.println(record.getName());
	});
	
	
	return "teacher displayed";
	
}

}
