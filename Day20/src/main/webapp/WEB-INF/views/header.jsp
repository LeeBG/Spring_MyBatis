<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="cpath" value="${pageContext.request.contextPath }"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${cpath }</title>

<style>
	#menu {
		list-style: none;
		padding: 0;
		display: flex;
	}
	#menu li {
		margin: 0 10px;
	}
	fieldset {
		display: inline-block;
	}
</style>
</head>
<body>
	<h1>파일 업로드 기초</h1>
	
	<ul id="menu">
		<li><a href="${cpath }">ex01</a></li>
		<li><a href="${cpath }/ex02">ex02</a></li>
		<li><a href="${cpath }/ex03">ex03</a></li>
		<li><a href="${cpath }/Account/">계정 프로필</a></li>
	</ul>
	
	<hr>