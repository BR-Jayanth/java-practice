package com.example.demo.test;

import java.util.HashMap;
import java.util.HashSet;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class testingapi {

	@GetMapping("/test")
	public String check() {
		return "hello how are u?";
	}
	@GetMapping("/api/num")
	public int num() {
		return 345;
	}
	@GetMapping("/api/bol")
	public boolean bol() {
		return true;
	}
//	this will not work
	@GetMapping("/api/custom-this-will-not-work")
	public Human custom() {
		return new Human();
	}
	@GetMapping("/api/HashMap")
	public HashMap arrayconcept() {
		var data = new HashMap();
		data.put("a","apple");
		return data;
	}
	@GetMapping("/api/HashSet")
	public HashSet arrayconcept2() {
		var data = new HashSet();
		data.add("apple");
		return data;
	}
	@GetMapping("/api/combo-HashMap-HashSet")
	public HashSet arrayconcept3() {
		var data = new HashMap();
		data.put("a","apple");
		data.put("b","ball");
		
		var data1 = new HashMap();
		data1.put("a1","apple");
		data1.put("b1","ball");
		
		var somedata = new HashSet();
		somedata.add(data);
		somedata.add(data1);
		return somedata;
	}
}

class Human{
	Human(){
	
	}
}