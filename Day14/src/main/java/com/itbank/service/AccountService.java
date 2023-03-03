package com.itbank.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itbank.model.AccountDAO;
import com.itbank.model.AccountDTO;

@Service
public class AccountService {
	
	@Autowired
	private AccountDAO dao;

	public List<AccountDTO> selectAll() {
		return dao.selectAll();
	}
	
	public AccountDTO login(AccountDTO user) {
		return dao.login(user);
	}
	
	public int join(AccountDTO user) {
		return dao.join(user);
	}

	public int update(AccountDTO user) {
		
		return dao.update(user);
	}

	public int delete(int idx) {
		return dao.delete(idx);
	}
	
}
