package com.itbank.model;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountDAO {
	@Select("select * from account order by idx desc")
	List<AccountDTO> selectAll();
	
	AccountDTO login(AccountDTO user);

	int join(AccountDTO user); 
}
