package com.itbank.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itbank.component.Paging;
import com.itbank.model.BoardDAO;
import com.itbank.model.BoardDTO;

@Service
public class BoardService {
	@Autowired
	private BoardDAO dao;
	
	public Map<String, Object> selectAll(Integer reqPage){
		if (reqPage == null) {reqPage = 1;}
		
		
		// 1. 요청한 페이지와 전체 게시글 수를 Paging 알고리즘에 전달
		Paging page = new Paging(reqPage, dao.boardCount());
		
		// 2. 페이지당 게시글 갯수와 페이지 시작 위치를 DB에 전달할 파라미터로 지정한다.
		Map<String, Object> param = new HashMap<String, Object>();
		
		param.put("perCount", page.getPerCount());
		param.put("offset", page.getOffset());
		
		// 3. 가져온 게시글 목록과 paging 결과를 Map에다 저장한다.
		Map<String, Object> result = new HashMap<String, Object>();
		
		result.put("list", dao.selectAll(param));
		result.put("page", page);
		return result;
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

	public Map<String, Object> getBoards(Map<String, Object> map,Integer reqPage) {
		if(reqPage == null) {reqPage = 1;}
		
		Paging page = new Paging(reqPage, dao.searchedBoardCount(map));
		
		// 2. 페이지당 게시글 갯수와 페이지 시작 위치를 DB에 전달할 파라미터로 지정한다.
		Map<String, Object> param = new HashMap<String, Object>();
			
		param.put("perCount", page.getPerCount());
		param.put("offset", page.getOffset());
				
		// 3. 가져온 게시글 목록과 paging 결과를 Map에다 저장한다.
		Map<String, Object> result = new HashMap<String, Object>();
			
		result.put("list", dao.selectSearch(map));
		result.put("page", page);
		return result;
	}

}
