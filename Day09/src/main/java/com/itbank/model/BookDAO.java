package com.itbank.model;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
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
	
	@Delete("delete book where idx=#{idx}")
	int delete(int idx);
	
	@Update("update book set title=#{title}, writer=#{writer}, publisher=#{publisher}, publish_date=#{publish_date}, price=#{price} "
			+ "where idx = #{idx}")
	int update(BookDTO dto);
	
	@Select("select * from book where idx=#{idx} order by idx desc")
	BookDTO selectOne(int idx);
}
