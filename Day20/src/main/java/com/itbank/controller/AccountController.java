package com.itbank.controller;

import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.model.AccountDTO;
import com.itbank.service.AccountService;

@Controller
@RequestMapping("/Account")
public class AccountController {
	
	@Autowired
	private AccountService as;
	
	@GetMapping
	public String login() {
		return "Account/login";
	}
	
	@PostMapping
	public ModelAndView login(AccountDTO user, HttpSession session) {
		ModelAndView mav = new ModelAndView("Account/fail");
		user = as.login(user);
		
		if (user != null) {
			session.setAttribute("user", user);
			mav.setViewName("redirect:/Account");
		}
		
		mav.addObject("msg", "로그인 실패");

		return mav;
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.removeAttribute("user");
		
		return "redirect:/Account";
	}
	
	@GetMapping("/myPage")
	public void myPage() {}
	
	@PostMapping("/myPage")
	public String update(AccountDTO dto) throws IOException {
		as.update(dto);
		
		return "redirect:/Account/logout";
	}
	
	
}
