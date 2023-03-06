package com.itbank.controller;

import java.io.File;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartRequest;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String ex01() {
		return "ex01";
	}
	
	@PostMapping("/")
	public ModelAndView ex01(MultipartRequest request) throws Exception {
		ModelAndView mav = new ModelAndView("ex01_result");
		MultipartFile mf = request.getFile("file");
		
		File dir = new File("E:\\uploadTest");
		
		if (dir.exists() == false) {	// 해당 디렉토리가 없으면
			dir.mkdir();				// 생상하라~
		}
		
		File upload = new File(dir, mf.getOriginalFilename());
		mf.transferTo(upload);
		
		mav.addObject("fileName", mf.getOriginalFilename());
		
		return mav;
	}
}
