package com.itbank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itbank.model.BookDTO;
import com.itbank.service.BookService;

@Controller
@RequestMapping("/book")
public class BookController {
	@Autowired
	private BookService bs;
	
	
	@GetMapping("/addbook")
	public void addBook() {}
	
	@PostMapping("/addbook")
	public String addbook(BookDTO dto) {
		int row = bs.addBook(dto);
		System.out.println(row != 0 ? "성공" : "실패");
		return "redirect:/";
	}
}
