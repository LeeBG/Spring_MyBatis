<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

	<h3>로그인 - 로그인</h3>

	<fieldset>
		<form method="POST">
			<p><input name="userid" placeholder="아이디" required/></p>
			<p><input name="userpw" type="password" placeholder="패스워드" required/></p>
			
			<p><button>전송</button></p>
		</form>
	</fieldset>	
</body>
</html>