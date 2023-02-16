<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="cpath" value="${pageContext.request.contextPath }"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${cpath }</title>
<link rel="stylesheet" href="${cpath }/resources/css/style.css" type="text/css"/>
</head>
<body>
	<h1>${cpath } - Home</h1>
	<hr/>
	
	<ul>
		<li><a href="${cpath }">Home</a></li>
		<li><a href="${cpath }/book/addbook">책 추가</a></li>
	</ul>
</body>
</html>