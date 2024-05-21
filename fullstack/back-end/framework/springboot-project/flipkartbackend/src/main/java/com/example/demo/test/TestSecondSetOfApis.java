package com.example.demo.test;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class TestSecondSetOfApis {
     @GetMapping("/api/char")
	 public char character() {
		 return 'a';
	 }
}
