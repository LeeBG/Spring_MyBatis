package com.itbank.model;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface BookDAO {
	@Select("select * from book order by idx desc")
	List<BookDTO> selectAll();
	
	@Select("select banner from v$version")
	String test();
	
	@Insert("insert into book(title,writer,publisher,publish_date,price) "
			+ "values(#{title}, #{writer}, #{publisher}, #{publish_date}, #{price})")
	int insert(BookDTO dto);
}
