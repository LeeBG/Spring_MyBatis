package com.itbank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itbank.model.BookDAO;
import com.itbank.model.BookDTO;

@Service
public class BookService {
	@Autowired
	private BookDAO dao;
	
	
	public String getVer() {
		return dao.test();
	}


	public List<BookDTO> getBooks() {
		return dao.selectAll();
	}
}
