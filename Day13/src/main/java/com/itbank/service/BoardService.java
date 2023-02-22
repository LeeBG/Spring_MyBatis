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
	
	public Map<String, Object> getBoards(Integer reqPage){
		if (reqPage == null) {reqPage = 1;}
		
		
		// 1. 요청한 페이지와 전체 게시글 수를 Paging 알고리즘에 전달
		Paging page = new Paging(reqPage, dao.boardCount(null));
		
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
	// Map으로 받는 다면.. (지금은 주석처리)
//	public Map<String, Object> getBoards(Map<String, Object> map) {
//		
//		String rpage = (String)map.get("reqPage");
//		
//		Integer reqPage = Integer.parseInt(rpage); 
//		Paging page = new Paging(reqPage, dao.boardCount());
//			
//		map.put("perCount", page.getPerCount());
//		map.put("offset", page.getOffset());
//		
//		// 3. 가져온 게시글 목록과 paging 결과를 Map에다 저장한다.
//		Map<String, Object> result = new HashMap<String, Object>();
//			
//		result.put("list", dao.selectSearch(map));
//		result.put("page", page);
//		
//		return result;
//	}
	
public Map<String, Object> getBoards(String type, String search, Integer reqPage) {
		if(reqPage == null) {reqPage = 1;}
		

		// 3. 가져온 게시글 목록과 paging 결과를 Map에다 저장한다.
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("type", type);
		param.put("search", search);
		
		Paging page = new Paging(reqPage, dao.boardCount(param));
		
		param.put("perCount", page.getPerCount());
		param.put("offset", page.getOffset());
		
		
		Map<String,Object> result = new HashMap<String, Object>();
		
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
		return dao.deleteboard(idx);
	}
	
	public int update(BoardDTO dto) {
		return dao.update(dto);
	}
	
	public int updateView(int idx) {
		return dao.updateView(idx);
	}

}
