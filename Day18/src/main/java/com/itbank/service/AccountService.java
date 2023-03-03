package com.itbank.service;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
	
	public List<AccountDTO> selectAll(){
		return dao.selectAll();
	}
	
	public AccountDTO login(AccountDTO user) throws UnsupportedEncodingException, NoSuchAlgorithmException {
		String encodedPw = hash.getHash(user.getUserpw());
		
		user.setUserpw(encodedPw);
		AccountDTO row = dao.login(user);
		
		if(row == null) {
			throw  new NullPointerException("로그인 실패!!");
		}
		
		return row;
	}
	
	// 회원가입
	public int join(AccountDTO user) throws UnsupportedEncodingException, NoSuchAlgorithmException {
		String encodedPw = hash.getHash(user.getUserpw());
		user.setUserpw(encodedPw);
		
		return dao.join(user);
	}
	
	// 회원 수정
	public int update(AccountDTO user) throws UnsupportedEncodingException, NoSuchAlgorithmException {
		String encodedpw = "";
		System.out.println();
		if(user.getUserpw().length() != 128) { // hash처리된 비밀번호가 아니라면
			encodedpw=hash.getHash(user.getUsername());
			user.setUserpw(encodedpw);
		}
		return dao.update(user);
	}
	
	// 회원탈퇴
	public int delete(int idx) {
		return dao.delete(idx);
	}
}
