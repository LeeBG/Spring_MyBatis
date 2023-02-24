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
	
	// throws : 호출한 위치로 예외를 전가
	// throw  : 예외를 의도적으로 발생
	public AccountDTO login(AccountDTO user) throws NullPointerException{
		AccountDTO row = dao.login(user);
		
		if(row == null) {
			// 예외를 의도적으로 발생시켜서 ControllerAdvice에게 예외를 전가한다.
			throw new NullPointerException("로그인 실패");
		}
		
		return dao.login(user);
	}
	
	public int join(AccountDTO user) throws Exception {
		return dao.join(user);
	}

	public int update(AccountDTO user) {
		
		return dao.update(user);
	}

	public int delete(int idx) {
		return dao.delete(idx);
	}
	
}
