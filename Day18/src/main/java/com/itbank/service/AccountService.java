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
			throw  new NullPointerException("로그인 실패");
		}
		
		return row;
	}

	public int join(AccountDTO user) throws UnsupportedEncodingException, NoSuchAlgorithmException {
		String encodedPw = hash.getHash(user.getUserpw());
		user.setUserpw(encodedPw);
		
		return dao.join(user);
	}
	
	
}
