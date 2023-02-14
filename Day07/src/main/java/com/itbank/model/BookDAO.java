package com.itbank.model;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface BookDAO {
	@Select("select banner from v$version")
	String test();
	
	@Select("select * from book order by idx desc")
	List<BookDTO> selectAll();
}
