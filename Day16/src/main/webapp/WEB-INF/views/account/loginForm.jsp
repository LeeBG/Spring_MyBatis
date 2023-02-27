<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp" %>

	<form action="${cpath }/account/login" method="POST">
		<p><input name="userid" placeholder="id입력" required></p>
		<p><input name="userpw" type="password" placeholder="pw입력" required></p>
		<button>로그인</button>
	</form>
	<p><button onclick="javascript:history.go(-1)">이전 페이지</button></p>
<%@ include file="../layout/footer.jsp" %>