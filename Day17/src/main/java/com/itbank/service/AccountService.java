package com.itbank.service;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import com.itbank.component.SHA512;
import com.itbank.model.AccountDAO;
import com.itbank.model.AccountDTO;

@Service
public class AccountService {
	
	@Autowired
	private AccountDAO dao;

	@Autowired
	private SHA512 hash;
	
	public List<AccountDTO> selectAll() {
		return dao.selectAll();
	}
	
	// throws : 호출한 위치로 예외를 전가
	// throw  : 예외를 의도적으로 발생
	public AccountDTO login(AccountDTO user) throws UnsupportedEncodingException, NoSuchAlgorithmException {
		String encodedPw = hash.getHash(user.getUserpw());
		user.setUserpw(encodedPw);
		AccountDTO row = dao.login(user);
		
		if(row == null) {
			// 예외를 의도적으로 발생시켜서 ControllerAdvice에게 예외를 전가한다.
			throw new NullPointerException("로그인 실패");
		}
		
		return dao.login(user);
	}
	
	public int join(AccountDTO user) throws Exception {
		String EncryptedPw = hash.getHash(user.getUserpw());
		user.setUserpw(EncryptedPw);
		
		return dao.join(user);
	}

	public int update(AccountDTO user) throws UnsupportedEncodingException, NoSuchAlgorithmException {
		String encodedPw = "";
		if(user.getUserpw().length()< 128) {
			System.out.println("Hash암호화 진행	");
			encodedPw = hash.getHash(user.getUserpw());
			user.setUserpw(encodedPw);
		}
		return dao.update(user);
	}

	public int delete(int idx) {
		return dao.delete(idx);
	}
	
	// src/main/resources에서 파일을 찾아서 자원의 형태로 등록
	@Value("classpath:agree.txt") // 특정 자원을 찾아준다.
	private Resource agree;
	
	public String getAgree() {
		Scanner sc = null;
		String data = "";
		try {
			sc = new Scanner(agree.getFile());
			while(sc.hasNextLine()) {
				data += sc.nextLine() + "\n";
			}
			
		}catch(IOException e){
			System.out.println("getAgree 예외 : "+e.getMessage());
		}finally {
			sc.close();
		}
		
		
		return data;
	}


	public String forgotId(AccountDTO user) {
		String userid = dao.selectFind(user);
		
		if(userid == null) {
			throw new NullPointerException("일치하는 계정이 존재하지 않습니다.");
		}
		
		return userid;
	}

	
	public String getNewPw(AccountDTO user) throws Exception {
		String newPw = UUID.randomUUID().toString().substring(0, 6);
		
		user.setUserpw(hash.getHash(newPw));
		int row = dao.updateNewPw(user);
		
		if(row == 0){
			throw new NullPointerException("일치하는 정보가 없습니다.");
		}
		
		return newPw;
	}
}
