package com.itbank.model;

import java.sql.Date;

public class BookDTO {
	private int idx;
	private String title,writer,publisher;
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
