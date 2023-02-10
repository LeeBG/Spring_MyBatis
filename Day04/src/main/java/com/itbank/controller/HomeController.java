package com.itbank.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/*
 * Controller 메서드의 반환형 
 *
 *	1. String : 반환하는 문자열이 view name이 된다.
 *	2. void	  : 요청하는 URL이 view name이 된다.
 *	3. ModelAndView : Attiribute 지정과 view name을 동시에 지정 가능
 *
 *	Controller 메서드의 매개변수
 *	1. HttpServletRequest 
 *	2. HttpServletResponse
 *	3. HttpServletSession
 */

@Controller
public class HomeController {
	
	
	// 요청메서드에 상관없이 URL 패턴만 맞으면 수행된다.
	@RequestMapping("/")
	public String home() {
		// home.jsp 페이지를 forward한다.
		return "home";
	}
	
	@GetMapping("/ex01")
	//@RequestMapping(value = "/ex01", method = RequestMethod.GET)
	public void ex01() {}

	@PostMapping("/ex01")
	public String ex01(HttpServletRequest request) {
		
		String name = request.getParameter("name");
		String sAge = request.getParameter("age");
		
		int age = Integer.parseInt(sAge);
		String result = (age >= 20) ? "성인입니다~~" : "미성년자 입니다~~";
		
		String msg = "%s님은 %d세로, %s \n";
		msg = String.format(msg, name, age, result);
		
		request.setAttribute("msg", msg);
		
		return "ex01_result";
	}
	
	@GetMapping("/ex02")
	public void ex02() {}
	
	@PostMapping("/ex02")
	public String ex02(@RequestParam String name, int age, Model model) {
		// 스프링 컨트롤러  웹의 파라미터를 메서드의 매개변수로 받을 수 있다.
		// 이 때, @RequesetParam은 생략이 가능하다.
		
		String result = (age >= 20) ? "성인" : "미성년자";
		String msg = "%s님은 %d세로 %s 입니다";
		
		
		msg = String.format(msg, name,age,result);
		
		model.addAttribute("msg",msg);
		
		// - request 대신에 .jsp파일에 attribute를 전달할 수 있는 객체
		// - 즉, 딱 필요한 기능만 빼놓은 객체
		
		return "ex02_result";
	}
	
	@GetMapping("ex03")
	public void ex03() {}
	
	@PostMapping("ex03")
	public ModelAndView ex03(String name, int age) {
		String result = (age >= 20) ? "성인" : "미성년자";
		
		String msg = "%s님은 %d세로 %s 입니다.";
		
		msg = String.format(msg, name,age,result);
		
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("ex03_result");
		mav.addObject("msg", msg);
		
		return mav;
	}
	
}
