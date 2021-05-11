package com.ojas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
	// security provide login
//	@GetMapping("/sayHello")
//	@ResponseBody
//	public String sayHello() {
//		return "Hello";
//		
//	}

	@RequestMapping("/")
	public String home() {
		return "Home.jsp";
	}
	
	@RequestMapping("/login")
	public String loginPage() {
		return "login.jsp";
	}
	
	@RequestMapping("/logout")
	public String logoutPage() {
		return "Home.jsp";
	}
}
