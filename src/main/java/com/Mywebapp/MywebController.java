package com.Mywebapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MywebController {
	@GetMapping("/welcome")
	public String name() {
		return "Welcome to Docker";
	}

}
