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
	List<BoardDTO> selectAll(Map<String, Object> param);
	
	@Select("select * from board where idx=#{idx}")
	BoardDTO selectOne(int idx);
	
	int addboard(BoardDTO dto);
	
	@Delete("delete board where idx=#{idx}")
	int deleteboard(int idx);

	int update(BoardDTO dto);

	int updateView(int idx);
	
	List<BoardDTO> selectSearch(Map<String, Object> map);

	int boardCount(Map<String, Object> map);

//	@Select("select count(*) from board " + 
//			"where ${type} like '%${search}%' " + 
//			"order by idx desc")
//	int searchedBoardCount(Map<String, Object> map);
	
}
