<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="cpath" value="${pageContext.request.contextPath }"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>계정 프로필</title>

<style>
	#menu {
		list-style: none;
		padding: 0;
		display: flex;
	}
	#menu li {
		margin: 0 10px;
	}
	#userInfo {
		display: flex;
		align-items: center;
	}
	#profile {
		border-collapse: collapse;
	}
	#profile th, #profile td {
		border: 1px solid black;
		padding: 10px 15px;
	}
</style>
</head>
<body>
	<h1>계정</h1>
	
	<ul id="menu">
		<li>
			<a href="${cpath }/Account/${empty user ? '' : 'logout' }">
				${empty user ? '로그인' : '로그아웃'}
			</a>
		</li>
		<li><a href="${cpath }/Account/signUp">회원가입</a></li>
		<li><a href="${cpath }/Account/myPage">마이페이지</a></li>
	</ul>
	
	<hr>