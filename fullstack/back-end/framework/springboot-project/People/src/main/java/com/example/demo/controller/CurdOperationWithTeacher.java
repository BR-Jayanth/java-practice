package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modal.teacher;
import com.example.demo.services.CurdOperationServices;

@RestController
@CrossOrigin
public class CurdOperationWithTeacher {
	
  @Autowired	
  private CurdOperationServices service;
  
  @GetMapping("/api/addTeacher")
  public String addteacher(teacher t1) {
	  
	  service.addTeacher(t1);
	  return "saved";
  }
  @DeleteMapping("/api/deleteTeacher")
  public String deleteteacher(teacher t1) {
	  
	  service.deleteTeacher(t1);
	  return "deleted";
  }
  @GetMapping("/api/readTeacher")
  public String readteacher(teacher t1) {
	  
	  service.readTeacher(t1);
	  return "displayed";
  }
  
  

}
