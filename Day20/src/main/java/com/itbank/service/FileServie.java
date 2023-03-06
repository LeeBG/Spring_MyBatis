package com.itbank.service;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class FileServie {

	@Value("file:E:\\uploadTest")
	private Resource dir;
	
	public String upload(MultipartFile file) throws IOException {
		File dst = new File(dir.getFile(), file.getOriginalFilename());
		// - 'E:\\uploadTest\\지정파일명'으로 파일 객체 생성
		
		file.transferTo(dst);
		
		return file.getOriginalFilename();
	}

	
	public String[] getFiles() throws IOException {
		String[] list = dir.getFile().list();
		
		return list;
	}
	
}
