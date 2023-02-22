package com.itbank.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.model.BoardDAO;
import com.itbank.service.BoardService;


@Controller
public class HomeController {
	
	@Autowired
	private BoardService bs;
	
	@GetMapping("/")
	public ModelAndView home(Integer reqPage) {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("map", bs.getBoards(reqPage));
		mav.setViewName("home");
		
		return mav;
	}

}
