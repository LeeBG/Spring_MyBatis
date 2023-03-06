package com.itbank.model;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface AccountDAO {

	@Select("select * from account "
			+ "where userid=#{userid} and userpw=#{userpw}")
	AccountDTO selectOne(AccountDTO user);

	@Update("update account "
			+ "set userpw=#{userpw}, email=#{email}, profile=#{profile} "
			+ "where userid=#{userid}")
	int update(AccountDTO dto);

}
