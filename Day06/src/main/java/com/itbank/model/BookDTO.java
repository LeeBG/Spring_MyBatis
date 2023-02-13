package com.itbank.model;

import java.sql.Date;

/*
 *
 * 이름           널?       유형            
------------ -------- ------------- 
IDX          NOT NULL NUMBER        
TITLE        NOT NULL VARCHAR2(100) 
WRITER       NOT NULL VARCHAR2(50)  
PUBLISHER    NOT NULL VARCHAR2(50)  
PUBLISH_DATE          DATE          
PRICE        NOT NULL NUMBER        

 */

// DTO는 table 행 마다 서로 다른 정보를 받아야한다.
// - 즉, 싱글톤으로 사용되면 안된다는 의미
// - 따라서, Spring bean으로 등록이 불필요

public class BookDTO {
	private int idx;
	private String title;
	private String writer;
	private String publisher;
	private Date publish_date;
	private int price;
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public Date getPublish_date() {
		return publish_date;
	}
	public void setPublish_date(Date publish_date) {
		this.publish_date = publish_date;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
