package com.itbank.controller;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
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
		mav.addObject("list", as.selectAll());
		mav.setViewName("/account/list");
		
		return mav;
	}
	
	@GetMapping("/login")
	public void login() {}
	
	@PostMapping("/login")
	public String login(AccountDTO user, HttpSession session) throws UnsupportedEncodingException, NoSuchAlgorithmException {
		session.setAttribute("user", as.login(user));
		return "redirect:/";
	}
	
	@GetMapping("/join")
	public void join() {}
	
	@PostMapping("/join")
	public ModelAndView join(AccountDTO user) throws UnsupportedEncodingException, NoSuchAlgorithmException {
		ModelAndView mav = new ModelAndView();
		String result = "회원가입 성공";
		
		int row = as.join(user);
		
		
		if(row == 0) {
			result="회원가입 실패!";
		}
		
		mav.addObject("msg",result);
		mav.setViewName("/account/success");
		return mav;	
	}
	
	@GetMapping("/logout")
	public ModelAndView logout(HttpSession session) {
		session.removeAttribute("user");
		String msg = "로그아웃 했습니다!";
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", msg);
		mav.setViewName("/account/success");
		return mav; 
	}
}
