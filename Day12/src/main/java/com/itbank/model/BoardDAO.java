package com.itbank.model;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardDAO {
	
	@Select("select * from board " + 
			"order by idx desc " + 
			"offset #{offset} rows " + 
			"fetch first #{perCount} rows only")
	List<BoardDTO> selectAll(Map<String, Object> param);
	
	@Select("select * from board where idx=#{idx}")
	BoardDTO selectOne(int idx);
	
	@Insert("insert into board(title,contents,writer) values(#{title},#{contents},#{writer})")
	int addboard(BoardDTO dto);
	
	@Delete("delete board where idx=#{idx}")
	int delteboard(int idx);
	
	@Update("update board set title=#{title}, contents=#{contents}, writer=#{writer} where idx=#{idx}")
	int update(BoardDTO dto);
	
	@Update("update board set view_count=view_count+1 where idx= #{idx}")
	int updateView(int idx);
	
	@Select("select * from board " + 
			"where title like '%${search}%'" + 
			"order by idx desc " + 
			"offset #{offset} rows " + 
			"fetch first #{perCount} rows only")
	List<BoardDTO> selectSearch(Map<String, Object> map);

	@Select("select count(*) from board")
	int boardCount();

	@Select("select count(*) from board " + 
			"where ${type} like '%${search}%' " + 
			"order by idx desc")
	int searchedBoardCount(Map<String, Object> map);
	
}
