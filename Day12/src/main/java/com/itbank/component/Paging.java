package com.itbank.component;

import org.springframework.stereotype.Component;

import com.itbank.model.BoardDAO;
 
public class Paging {
	
	private final int perCount = 10;
	private int offset;
	private int total;
	private int reqPage;
	
	private int perPage = 10;
	private int totalPage;
	private int section;
	private int begin;
	private int end;
	
	private boolean isPrev;
	private boolean isNext;
	
	public Paging(Integer reqPage, int total) { // 사용자 요청 페이지와 DB에서 전체페이지 수를 받는다.
		this.reqPage = reqPage;
		this.total = total;
		offset = (reqPage-1) * perCount;
		totalPage = total/perCount;
		totalPage += (total%perCount != 0) ? 1 : 0;
		
		section = (reqPage -1) / perPage;
		begin = (section * perPage) + 1;
		end = (section + 1) * perPage;
		end = (end > totalPage) ? totalPage : end;
		
		isPrev = section  != 0;
		isNext = totalPage != end;
	}

	public int getOffset() {
		return offset;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getReqPage() {
		return reqPage;
	}

	public void setReqPage(int reqPage) {
		this.reqPage = reqPage;
	}

	public int getPerPage() {
		return perPage;
	}

	public void setPerPage(int perPage) {
		this.perPage = perPage;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public int getSection() {
		return section;
	}

	public void setSection(int section) {
		this.section = section;
	}

	public int getBegin() {
		return begin;
	}

	public void setBegin(int begin) {
		this.begin = begin;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}

	public boolean getIsPrev() {
		return isPrev;
	}

	public void setIsPrev(boolean isPrev) {
		this.isPrev = isPrev;
	}

	public boolean getIsNext() {
		return isNext;
	}

	public void setIsNext(boolean isNext) {
		this.isNext = isNext;
	}

	public int getPerCount() {
		return perCount;
	}
	
}
