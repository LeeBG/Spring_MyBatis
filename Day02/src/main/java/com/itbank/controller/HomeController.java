package com.itbank.controller;

import javax.annotation.Generated;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping("/")
	public String home(HttpServletRequest request) {
		request.setAttribute("test", "스프링 테스트~");
		
		return "home";
	}
}
