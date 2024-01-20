package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class LoginController {
//
//	@GetMapping("/")
//	public String loginform() {
//		return "login";
//	}
	
//	@GetMapping("/home/")
//	public String loginform1() {
//		return "home";
//	}
	
	
	@GetMapping("/leave/")
	public String loginform() {
		return "leave";
	}
	
}
