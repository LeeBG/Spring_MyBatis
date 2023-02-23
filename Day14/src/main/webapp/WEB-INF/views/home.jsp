<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="layout/header.jsp" %>
	<h3>Account 테이블 양식</h3>
	
	<table>
	  <tr>
	    <th>idx</th>
	    <td>계정번호</td>
	    <td>primary key, default 시퀀스</td>
	  </tr>
	  
	  <tr>
	  	<th>userid</th>
	    <td>아이디</td>
	    <td>UNIQUE, NOT NULL</td>
	  </tr>
	  
	  <tr>
	  	<th>userpw</th>
	    <td>패스워드</td>
	    <td>NOT NULL</td>
	  </tr>
	  
	  <tr>
	  	<th>nick</th>
	    <td>닉네임</td>
	    <td>NOT NULL</td>
	  </tr>
	  
	  <tr>
	  	<th>email</th>
	    <td>이메일</td>
	    <td>NOT NULL</td>
	  </tr>
	  
	  <tr>
	  	<th>username</th>
	    <td>이름</td>
	    <td>NOT NULL</td>
	  </tr>
	  
	  <tr>
	  	<th>join_date</th>
	    <td>가입일</td>
	    <td>default sysdate</td>
	  </tr>
	</table>
	
	<!--
	
	create sequence account_pk_seq
	INCREMENT BY 1
	START WITH 1001
	MINVALUE 1001
	MAXVALUE 999999999999999
	NOCACHE
	NOCYCLE;
	
	create table account(
	idx         NUMBER default account_pk_seq.NEXTVAL constraint account_pk PRIMARY KEY,
	userid      VARCHAR2(100)   UNIQUE  NOT NULL,
	userpw     VARCHAR2(50)      NOT NULL,
	nick        VARCHAR2(100)     NOT NULL,
	email       VARCHAR2(100)      NOT NULL,
	name        VARCHAR2(50)   NOT NULL,
	join_date   DATE                    DEFAULT sysdate
	);
	
	desc account;

	-->
</body>
</html>