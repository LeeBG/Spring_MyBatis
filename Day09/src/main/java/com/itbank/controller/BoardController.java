package com.itbank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.model.BoardDTO;
import com.itbank.service.BoardService;

@Controller
public class BoardController {
	@Autowired
	private BoardService boardService;
	
	public ModelAndView selectAll() {
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("board_list");
		mav.addObject("list", boardService.selectAll());
		
		return mav;
	}
}
