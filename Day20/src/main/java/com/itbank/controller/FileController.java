package com.itbank.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.model.FileDTO;
import com.itbank.service.FileServie;

@Controller
public class FileController {
	
	@Autowired
	private FileServie fs;
	
	@GetMapping("/ex02")
	public void ex02() {}
	
	// MultiparFile 객체로 바로 파일을 받아서 처리할 수도 있다
	@PostMapping("/ex02")
	public ModelAndView ex02(MultipartFile file, String menu) 
			throws IOException {
		
		// ex01에서는 Controller에서 파일 처리 코드를 작성했지만
		// ex02는 이 코드를 Service로 분리
		ModelAndView mav = new ModelAndView();
		String fileName = fs.upload(file);
		
		mav.addObject("fileName", fileName);
		mav.addObject("menu", menu);
		
		mav.setViewName("ex02_result");
		
		return mav;
	}

	@GetMapping("/ex03")
	public ModelAndView ex03() throws IOException {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("list", fs.getFiles());
		mav.setViewName("ex03");
		
		return mav;
	}
	
	// 파라미터가 여럿인 경우는 DTO로 처리하면 수월
	@PostMapping("/ex03")
	public String ex03(FileDTO dto) throws IOException {
		fs.upload(dto.getFile());
		
		return "redirect:/ex03";
	}
	
}
