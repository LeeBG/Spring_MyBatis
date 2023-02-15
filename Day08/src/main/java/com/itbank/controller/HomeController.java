package com.itbank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.service.BookService;

@Controller
public class HomeController {
	@Autowired
	private BookService bs;

	@GetMapping("/")
	public ModelAndView home() {
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("home");
		mav.addObject("test", bs.test() );
		mav.addObject("list", bs.selectAll());
		
		return mav;
	}
}
