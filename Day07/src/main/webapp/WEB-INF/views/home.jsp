<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>
	<h1>myBatis 테스트~</h1>
	<hr/>
	
	<h3>ver : ${ver }</h3>
	<table border="1" cellspacing="0" cellpadding="10">
		<tr>
			<th>idx</th>
			<th>제목</th>
			<th>저자</th>
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
			<td>${row.price}</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>