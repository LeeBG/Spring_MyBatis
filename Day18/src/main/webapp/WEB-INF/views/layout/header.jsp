<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="cpath" value="${pageContext.request.contextPath }" />
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="${cpath }/resources/css/style.css" />
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
<script
	src="https://cdn.jsdelivr.net/npm/jquery@3.6.3/dist/jquery.slim.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
<title>회원관리페이지입니다.</title>
</head>
<body>
	<div class="container pt-3">
		<nav class="navbar navbar-expand-sm bg-secondary navbar-dark">
			<ul class="navbar-nav">
				<li class="nav-item active"><a class="nav-link" href="${cpath }/">회원관리페이지</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="${cpath }/account/list">회원 리스트</a></li>
				<c:choose>
					<c:when test="${empty user}">
						<li class="nav-item"><a class="nav-link" href="${cpath }/account/login">로그인</a></li>
						<li class="nav-item"><a class="nav-link" href="${cpath }/account/join">회원가입</a></li>
					</c:when>
					<c:otherwise>
						<li class="nav-item"><a class="nav-link" href="${cpath }/account/logout">로그아웃</a></li>
						<li class="nav-item"><a class="nav-link" href="${cpath }/account/mypage">내정보</a></li>
					</c:otherwise>
				</c:choose>
			</ul>
		</nav>
	</div>