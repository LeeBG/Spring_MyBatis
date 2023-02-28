<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp" %>

	<h4>ID 찾기</h4>
	
	<form method="POST">
		<p><input name="username" type="type" placeholder="성함" required></p>
		<p><input name="email" type="email" placeholder="가입시 등록한 이메일" required></p>
		
		<button>전송</button>
	</form>

</body>
</html>