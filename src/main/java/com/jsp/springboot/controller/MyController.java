package com.jsp.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@GetMapping("/")
	public String sayHello() {
		return " Welcome to my first Springboot Application ";
	}
}
