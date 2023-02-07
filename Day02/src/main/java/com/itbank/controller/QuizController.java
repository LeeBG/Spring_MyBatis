package com.itbank.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class QuizController {
	@GetMapping("/quiz")
	public void quiz() {}
	
	@PostMapping("/quiz")
	public String quiz(HttpServletRequest request) {
		
		String snum1 = request.getParameter("num1");
		String snum2 = request.getParameter("num2");
		
		int num1 = Integer.parseInt(snum1);
		int num2 = Integer.parseInt(snum2);
		
		request.setAttribute("num1", num1);
		request.setAttribute("num2", num2);
		
		return "quiz";
	}
}
