package com.itbank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.model.BoardDTO;
import com.itbank.service.BoardService;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	@GetMapping("/view/{idx}")
	public ModelAndView list(@PathVariable int idx) {
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/board/view");
		mav.addObject("list",boardService.selectOne(idx) );
		
		return mav;
	}
	
	@GetMapping("/addboard")
	public ModelAndView addboard() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/board/addboard");
		
		return mav;
	}
	
	@PostMapping("/addboard")
	public String addboard(BoardDTO dto) {
		int row = boardService.addBoard(dto);
		System.out.println(row != 0 ? "성공" : "실패");
		return "redirect:/";
	}
	
}
