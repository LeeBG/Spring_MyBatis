package com.itbank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itbank.model.BookDAO;
import com.itbank.model.BookDTO;

@Service
// - 세부적인 로직 처리를 위한 spring bean으로 등록하는 어노테이션
// - 본래 Controller에서 처리할 세부적인 로직을 Serivce에서 처리
public class BookService {
	@Autowired
	private BookDAO dao;
	
	public String ver() {
		return dao.test();
	}
	
	public List<BookDTO> getBooks(){
		return dao.selectAll();
	}
}
