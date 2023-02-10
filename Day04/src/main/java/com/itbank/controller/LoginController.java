package com.itbank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.model.AccountDTO;

@Controller
@RequestMapping("quiz")
public class LoginController {
	@GetMapping("login")
	public void login() {};
	
	@PostMapping("login")
	public ModelAndView login(AccountDTO dto) {
		ModelAndView mav = new ModelAndView("quiz/login_result");
		// ModelAndView mav = new ModelAndView();
		// mav.setViewName("quiz/login_result");
		mav.addObject("dto", dto);
		return mav;
	}
}
