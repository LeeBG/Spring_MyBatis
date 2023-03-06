<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

	<c:if test="${empty user }">
	<form method="POST">
		<p><input name="userid" placeholder="ID" required></p>
		<p><input name="userpw" type="password" placeholder="PW" required></p>
		
		<button>로그인</button>
	</form>
	</c:if>
	
	<c:if test="${not empty user }">
		<div id="userInfo">
			<img src="${cpath }/${user.profile }" width="20px">
			<h3>${user.nick }님 로그인</h3>
		</div>
	</c:if>
</body>
</html>