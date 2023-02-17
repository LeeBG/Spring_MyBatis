package com.itbank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.model.BookDTO;
import com.itbank.service.BookService;

@Controller
@RequestMapping("/book")
public class BookController {
	@Autowired
	private BookService bs;

	@GetMapping("/addbook")
	public void addbook() {}
	
	@PostMapping("/addbook")
	public String addbook(BookDTO dto) {
		int row = bs.addBook(dto);
		System.out.println(row != 0 ? "성공" : "실패");
		return "redirect:/";
	}
	
	@GetMapping("/delete/{idx}")
	public String deleteBook(@PathVariable int idx) { //
		int row = bs.deleteBook(idx);
		if(row != 1) {
			System.out.println("!!");
		}
		return "redirect:/";	
	}
	
	@GetMapping("/update/{idx}")
	public ModelAndView updateBook(@PathVariable int idx) {
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("book/update");
		mav.addObject("row", bs.selectOne(idx));
		mav.addObject("idx", idx);
		return mav;
	}
	
	@PostMapping("/update/{idx}")
	public String update(@PathVariable int idx, BookDTO dto) {
		dto.setIdx(idx);
		int row = bs.update(dto);
		
		if(row != 1) {
			System.out.println("");
		}
		return "redirect:/";
	}
}
