package com.itbank.service;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.itbank.model.AccountDAO;
import com.itbank.model.AccountDTO;

@Service
public class AccountService {

	@Autowired
	private AccountDAO dao;
	
	public AccountDTO login(AccountDTO user)  {
		return dao.selectOne(user);
	}
	
	public int update(AccountDTO dto) throws IOException {
		// 1. 업로드를 위한 객체를 dto에서 받아온다
		MultipartFile file = dto.getFile();
		
		// 2. 업로드할 경로를 지정한다
		// - E:\profile\계정명\profile.png
		File path = new File("E:/profile/" + dto.getUserid());
		String id = "";
		String name = "profile.png";
		
		// 3. 만약 사용자가 이미지를 전달하지 않으면 크기는 0
		if (dto.getFile().getSize() == 0) {
			
			// 4. 그때는 기본 이미지 경로로 세팅
			// - E:\profile\default.png
			path = new File("E:/profile/");
			name = "default.png";
		}
		
		// 5. 업로드할 경로와 파일명을 지정
		File dst = new File(path, name);
		
		// 6. 이미지가 전송되면 크기가 0이 아니므로 업로드를 수행
		if (dto.getFile().getSize() != 0) {
			// 7. 만약 계정명 디렉토리가 없으면 생성하고 진행
			if (path.exists() == false) {
				path.mkdir();
			}
			
			id = dto.getUserid() + "/";
			file.transferTo(dst);
		}
		
		// 7. DB에 들어갈 경로를 따로 세팅
		dto.setProfile("profile/" + id + name);
		
		// System.out.println(dto.getProfile());
		// - 파일명 확인을 위한 디버깅 코드
		
		return dao.update(dto);
	}
}
