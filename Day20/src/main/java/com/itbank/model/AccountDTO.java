package com.itbank.model;

import java.sql.Date;

import org.springframework.web.multipart.MultipartFile;

/*
	IDX       NOT NULL NUMBER        
	USERID    NOT NULL VARCHAR2(20)  
	USERPW    NOT NULL VARCHAR2(128) 
	NICK      NOT NULL VARCHAR2(50)  
	EMAIL     NOT NULL VARCHAR2(50)  
	USERNAME  NOT NULL VARCHAR2(30)  
	JOIN_DATE          DATE          
	PROFILE            VARCHAR2(500)
*/

public class AccountDTO {
	private int idx;
	private String userid, userpw, nick;
	private String email, username, profile;
	private Date join_date;
	
	private MultipartFile file;
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUserpw() {
		return userpw;
	}
	public void setUserpw(String userpw) {
		this.userpw = userpw;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	public Date getJoin_date() {
		return join_date;
	}
	public void setJoin_date(Date join_date) {
		this.join_date = join_date;
	}
	public MultipartFile getFile() {
		return file;
	}
	public void setFile(MultipartFile file) {
		this.file = file;
	}
}
