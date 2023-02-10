<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

	<h3> quiz - 로그인 결과</h3>
	
	<table>
		<tr>
			<th>아이디</th>
			<td>${dto.userid }</td>
		</tr>
		
		<tr>
			<th>패스워드</th>
			<td>${dto.userpw }</td>
		</tr>
	</table>
</body>
</html>