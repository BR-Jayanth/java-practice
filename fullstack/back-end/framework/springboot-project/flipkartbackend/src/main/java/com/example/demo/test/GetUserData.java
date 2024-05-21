package com.example.demo.test;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class GetUserData {
	@GetMapping("/api/user-input-one")
	public String UserInput(String a) {
		return a;
	}
	@GetMapping("/api/user-input-default")
	public String UserInputdefault(@RequestParam(defaultValue="default given give value") String a) {
		return a;
	}
	
	@PostMapping("/api/user-input-hidden")
	public String UserInputwithPost(String a) {
		return a;
	}

}
