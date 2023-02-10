package com.itbank.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/ex05")// /WEB-INF/views/ex05/ 폴더 
public class Ex05Controller {
	@GetMapping("/test")// '/WEB-INF/views/ex05/test.jsp' 
	public void ex05() {}

	@PostMapping("/test")
	public ModelAndView ex05(@RequestParam Map<String, Object> map) {
		// 파라미터를 Map으로 받을 때에는 @RequestParam을 생략하면 안된다.
		// - map은 다른 용도로도 사용되기 때문에 @RequestParam을 생략하면 안받아진다.
		ModelAndView mav = new ModelAndView("ex05/test_result");
		
		mav.addObject("map",map);
		
		return mav;
	}
}
