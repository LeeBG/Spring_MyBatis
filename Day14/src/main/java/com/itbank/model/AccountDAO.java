package com.itbank.model;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountDAO {
	@Select("select * from account order by idx desc")
	List<AccountDTO> selectAll();
	
	AccountDTO login(AccountDTO user);
	
	int join(AccountDTO user);

	int update(AccountDTO user);

	int delete(int idx);
	
}
