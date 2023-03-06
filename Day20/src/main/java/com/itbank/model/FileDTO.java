package com.itbank.model;

import org.springframework.web.multipart.MultipartFile;

public class FileDTO {
	private MultipartFile file;
	private String memo;
	
	public MultipartFile getFile() {
		return file;
	}
	public void setFile(MultipartFile file) {
		this.file = file;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
}
