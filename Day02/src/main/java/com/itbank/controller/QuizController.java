package com.itbank.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class QuizController {
	@GetMapping("quiz")
	public void quiz() {}
	
//	@PostMapping("quiz")
//	public String quiz(HttpServletRequest request) {
//		
//		String snum1 = request.getParameter("num1");
//		String snum2 = request.getParameter("num2");
//		
//		int num1 = Integer.parseInt(snum1);
//		int num2 = Integer.parseInt(snum2);
//		
//		request.setAttribute("num1", num1);
//		request.setAttribute("num2", num2);
//		
//		return "quiz_result";
//	}
	
	@PostMapping("quiz")
	public String quiz(Model model, int num1, int num2) {
		// Model : request의 Attribute를 사용할 수 있는 객체
		// 매개변수 n1, n2 : 전달되는 파라미터 명과 일치하면 해당 변수에 저장된다.
		
		int result = num1 + num2;
		
		System.out.println("num1 = "+num1);
		System.out.println("num2 = "+num2);
		
		model.addAttribute("num1", num1);
		model.addAttribute("num2", num2);
		model.addAttribute("result", result);
		// == request.setAttibute("result",result);
		
		return "quiz_result";
	}
	
}
