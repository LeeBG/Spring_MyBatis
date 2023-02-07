package com.itbank.controller;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Ex01Controller {
	// 반환형
	// - String : 리턴하는 문자열이 view가 된다.
	// - void   : 요청하는 주소가 view가 된다.
	
	@GetMapping("/ex01")
	public void ex01() {}
	
	@PostMapping("/ex01")
	public String ex01(HttpServletRequest request) {
		
//		try {
//			request.setCharacterEncoding("utf-8");
//		} catch (UnsupportedEncodingException e) {}
//		
		String name= request.getParameter("name");
		String sage = request.getParameter("age");
		
		int age = Integer.parseInt(sage);
		String result = "미성년자";
		
		if(age >= 20) {
			result = "성인";
		}
		
		request.setAttribute("result", result);
		request.setAttribute("name", name);
		return "ex01_result";
	}
}
