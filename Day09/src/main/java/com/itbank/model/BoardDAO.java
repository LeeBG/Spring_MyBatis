package com.itbank.model;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardDAO {
	@Select("Select * from board order by idx desc")
	public List<BoardDTO> selectAll();
}
