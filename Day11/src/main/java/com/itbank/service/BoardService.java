package com.itbank.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itbank.model.BoardDAO;
import com.itbank.model.BoardDTO;

@Service
public class BoardService {
	@Autowired
	private BoardDAO dao;
	
	public List<BoardDTO> selectAll(){
		return dao.selectAll();
	}
	
	public BoardDTO selectOne(int idx) {
		return dao.selectOne(idx);
	}
	
	public int addBoard(BoardDTO dto) {
		return dao.addboard(dto);
	}
	
	public int delete(int idx) {
		return dao.delteboard(idx);
	}
	
	public int update(BoardDTO dto) {
		return dao.update(dto);
	}
	
	public int updateView(int idx) {
		return dao.updateView(idx);
	}

	public List<BoardDTO> getBoards(Map<String, Object> map) {
		return dao.selectSearch(map);
	}

}
