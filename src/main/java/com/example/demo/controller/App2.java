package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class App2 {
	
	@GetMapping("/app2")
	public String getData() {
		return "Welcome to spring boot example:-App2 ";
	}
	
	

}
