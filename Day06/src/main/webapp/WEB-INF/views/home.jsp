<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="cpath" value="${pageContext.request.contextPath }"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${cpath }</title>
</head>
<body>
	<h1>${cpath } - Spring JDBC</h1>
	<hr/>
	
	<h3>Oracle 버전 : ${ver }</h3>
	
	<table border="1" cellspacing="0" cellpadding="10">
		<tr>
			<th>idx</th>
			<th>제목</th>
			<th>작성자</th>
			<th>출판사</th>
			<th>출판일</th>			
			<th>가격</th>			
		</tr>
		<c:forEach var="row" items="${list }">
		<tr>
			<td>${row.idx }</td>
			<td>${row.title }</td>
			<td>${row.writer }</td>
			<td>${row.publisher }</td>
			<td>${row.publish_date }</td>
			<td>${row.price }</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>