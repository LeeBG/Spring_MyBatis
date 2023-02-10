<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

	<h3 style="color:blue">ex01 - Request</h3>

	<form method="POST">
		<p><input name="name" placeholder="이름" required/></p>
		<p><input name="age" type="number" placeholder="나이" required/></p>
		
		<p><button>전송</button></p>
	</form>

</body>
</html>