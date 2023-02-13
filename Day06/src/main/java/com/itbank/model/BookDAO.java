package com.itbank.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository		// 데이터 베이스로 접근하는 스프링 빈으로 등록하는 어노테이션
public class BookDAO {
	
	@Autowired	// 스프링 빈 객체를 자동으로 찾아서 주입하는 어노테이션
	private JdbcTemplate jt;
	
	public String test() {
		String sql = "select banner from v$version";
		
		return jt.queryForObject(sql, String.class);
		// queryForObject()
		// - Table 한 줄의 결과를 얻을때 사용
	}
	
	public List<BookDTO> selectAll(){
		String sql = "select * from book order by idx desc";
		
		
		// 람다식 : 함수형 인터페이스에 있는 메서드를 구현 시 사용
		RowMapper<BookDTO> rm = (ResultSet rs, int rowNum) -> {
			BookDTO row = new BookDTO();
			row.setIdx(rs.getInt("idx"));
			row.setPrice(rs.getInt("price"));
			row.setPublish_date(rs.getDate("publish_date"));
			row.setPublisher(rs.getString("publisher"));
			row.setTitle(rs.getString("title"));
			row.setWriter(rs.getString("writer"));
			
			return row;
		};
		
		// SQL 구문과 RowMapper를 jt에 전달하면 모든 행을 List로 변환해준다.
		// jt (sql , 연결자)
		return jt.query(sql, rm); 
	}
}
