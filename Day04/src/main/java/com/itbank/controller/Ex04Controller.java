package com.itbank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.model.AccountDTO;

// 컨트롤러 클래스에 RequestMapping을 설정하여 주소만 지정하고
// 하위 메서드에서는 GetMapping PostMapping 등 HTTP 메서드를 바로 지정할 수 있다.

@Controller
@RequestMapping("/ex04")
public class Ex04Controller {
	@GetMapping 			// viewname은 'WEB-INF/views/ex04.jsp' 가 된다
	public void ex04() {}
	
//	@GetMapping("/test") // view name은 'WEB-INF/views/ex04/test.jsp'
	
	@PostMapping
	public ModelAndView ex04(AccountDTO dto) {
		// 매개변수와 클래스 타입으로 두면 
		// 웹의 파라미터와 해당 객체의 멤버 이름이 일치하는 것을 모두 저장
		
		ModelAndView mav = new ModelAndView("ex04_result");
		// - view name 은 생성자에 지정해도 된다.
		
		mav.addObject("dto", dto);
		
		return mav;
	}
	
}
