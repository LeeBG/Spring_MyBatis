package com.itbank.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
		boardService.updateView(idx);
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
	
	@GetMapping("/update/{idx}")
	public ModelAndView update(@PathVariable int idx) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/board/updateboard");
		mav.addObject("row", boardService.selectOne(idx));
		return mav;
	}
	
	@PostMapping("/update/{idx}")
	public String update(@PathVariable int idx, BoardDTO dto) {
		dto.setIdx(idx);
		int row = boardService.update(dto);
		System.out.println(row != 1 ? "실패" : "성공");
		return "redirect:/";
	}
	
	@GetMapping("/delete/{idx}")
	public String delete(@PathVariable int idx,HttpServletRequest request) {
		int row = boardService.delete(idx);
		System.out.println(row != 1 ? "실패" : "성공");
		return "redirect:"+request.getHeader("Referer");
	}
	
	@GetMapping("/search")
	public ModelAndView search(@RequestParam Map<String,Object> map) {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("map",boardService.getBoards(map));
		mav.setViewName("board/search");
		
		return mav;
	}
}
