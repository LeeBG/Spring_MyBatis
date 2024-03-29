<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="cpath" value="${pageContext.request.contextPath }"/>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="${cpath }/resources/css/style.css" type="text/css">
<meta charset="UTF-8">
<title>${cpath }</title>
</head>
<body>
	<h1>${cpath } - ${user.nick }</h1>
	
	
	<ul>
		<li><a href="${cpath }">Home</a></li>
		
		<li><a href="${cpath }/account/list">회원목록 보기</a></li>
		
		<c:choose>
			<c:when test="${empty user }">
				<li><a href="${cpath }/account/login">로그인</a></li>
				<li><a href="${cpath }/account/join">회원가입</a></li>
			</c:when>
			<c:otherwise>
				<li><a href="${cpath }/account/logout">로그아웃</a></li>
				<li><a href="${cpath }/account/mypage">내 정보</a></li>
			</c:otherwise>
		</c:choose>
	</ul>
	<hr/>