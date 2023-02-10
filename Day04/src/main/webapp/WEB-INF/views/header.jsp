<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="cpath" value="${pageContext.request.contextPath }"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
<style>
	a {
		text-decoration: none;
	}
	
	a:hover{
		color : blue;
		background-color: pink;
	}

	ul {
		display: flex;
		list-style: none;
		padding: 0px;
	}
	
	ul li {
	
		margin: 0 10px;
	}
	
	table {
		display: inline-block;
		border-collapse: collapse;
	}
	
	th, td {
		border : 1px solid black;
		padding : 5px 10px;
	}
</style>
</head>
<body>
	<h1>${cpath }</h1>
	
	<ul>
		<li><a href="${cpath }">home</a></li>
		<li><a href="${cpath }/ex01">ex01</a></li>
		<li><a href="${cpath }/ex02">ex02</a></li>
		<li><a href="${cpath }/ex03">ex03</a></li>
		<li><a href="${cpath }/ex04">ex04</a></li>
		<li><a href="${cpath }/ex05/test">ex05</a></li>
		<li><a href="${cpath }/quiz/login">quiz</a></li>
	</ul>
	
	<hr/>
</body>