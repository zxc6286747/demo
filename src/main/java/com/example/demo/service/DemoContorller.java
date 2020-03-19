package com.example.demo.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoContorller {
	
	@RequestMapping("/")
	public String a() {
		return "hello";
	}


}
