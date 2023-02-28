<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp" %>

	<form action="${cpath }/account/join" method="POST">
		<p><input name="userid" placeholder="id입력" required></p>
		<p><input name="userpw" type="password" placeholder="pw입력" required></p>
		<p><input name="nick" placeholder="닉네임 입력" required ></p>
		<p><input name="email" type="email" placeholder="이메일 입력" required></p>
		<p><input name="username" type="text" placeholder="이름 입력" required></p>
		<button>회원가입</button>
	</form>
	<p><button onclick="javascript:history.go(-1)">이전 페이지</button></p>
<%@ include file="../layout/footer.jsp" %>