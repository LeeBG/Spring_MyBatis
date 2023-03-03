package com.itbank.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.model.AccountDTO;
import com.itbank.service.AccountService;

@RequestMapping("/account")
@Controller
public class AccountController {
	
	@Autowired
	private AccountService as;
	
	@GetMapping("/list")
	public ModelAndView list() {
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("/account/list");
		mav.addObject("list", as.selectAll());
		return  mav;
	}
	
	@GetMapping("/login")
	public ModelAndView login() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/account/loginForm");
		
		return mav;
	}
	
	@PostMapping("/login")
	public String login(HttpSession session, AccountDTO user) {
		session.setAttribute("user", as.login(user));
		
		return "redirect:/";
	}
	
	@GetMapping("/join")
	public ModelAndView join() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/account/joinForm");
		
		return mav;
	}
	
	@PostMapping("/join")
	public String join(AccountDTO user) {
		int row = as.join(user);
		if(row != 1) {
			System.out.println("실패");
		}
		return "redirect:/";
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.removeAttribute("user");
		
		return "redirect:/";
	}
	
	@GetMapping("/mypage")
	public void mypage() {}
	
	@PostMapping("/update/{idx}")
	public String update(@PathVariable int idx, AccountDTO user) {
		int row = as.update(user);
		if(row != 1) {
			System.out.println("실패");
		}
		return "redirect:/";
	}
	
	@GetMapping("/delete/{idx}")
	public String delete(@PathVariable int idx) {
		int row = as.delete(idx);
		
		if(row != 1) {
			System.out.println("실패");
		}
		
		return "redirect:/";
	}
}
