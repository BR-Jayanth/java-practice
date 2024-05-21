package com.example.demo.serverSideRendering;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoadingJspFiles {
	
	@RequestMapping("/home")
	public String home() {
		
		
		return "home";
	}
	@RequestMapping("/*")
	public String notFound() {
		
		
		return "notfound";
	}


}
