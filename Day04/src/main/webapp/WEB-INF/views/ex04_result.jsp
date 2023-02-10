<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
	<table>
		<tr>
			<th>아이디</th>
			<td>${dto.userid }</td>
		</tr>
		
		<tr>
			<th>패스워드</th>
			<td>${dto.userpw }</td>
		</tr>
		
		<tr>
			<th>이름</th>
			<td>${dto.name }</td>
		</tr>
		
		<tr>
			<th>이메일</th>
			<td>${dto.email }</td>
		</tr>
		
		
		<tr>
			<th>생년월일</th>
			<td>${dto.birth }</td>
		</tr>
		
	</table>
</body>
</html>