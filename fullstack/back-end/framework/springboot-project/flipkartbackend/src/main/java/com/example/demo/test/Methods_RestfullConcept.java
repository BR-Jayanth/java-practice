package com.example.demo.test;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class Methods_RestfullConcept {

	@GetMapping("/api/get-concept")
	public String getMethod() {
		return "I'm a get methods";
	}
	@PostMapping("/api/post-concept")
	public String postMethod() {
		return "I'm a post methods";
	}
	@PutMapping("/api/put-concept")
	public String putMethod() {
		return "I'm a get methods";
	}
	@DeleteMapping("/api/delete-concept")
	public String deleteMethod() {
		return "I'm a post methods";
	}
}
