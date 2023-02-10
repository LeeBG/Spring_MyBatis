<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

	<h3 style="color:skyblue">회원가입 - 예제</h3>

	<form method="POST">
		<p><input name="userid" placeholder="아이디" required/></p>
		<p><input name="userpw" type="password" placeholder="패스워드" required/></p>
		<p><input name="name" placeholder="이름" required/></p>
		<p><input name="email" type="email" placeholder="이메일" required/></p>
		<p><input name="birth" type="date" placeholder="생년월일" required/></p>
		<button>전송</button>
	</form>

</body>
</html>