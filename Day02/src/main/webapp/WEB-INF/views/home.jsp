<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>
	<h1>
		Hello world!  
	</h1>
	
	<p>  The time on the server is ${serverTime}. </p>
	<p>  테스트 : ${test }</p>
	
	<ul>
		<li><a href="ex01"><button>ex01</button></a></li>
		<li><a href="quiz"><button>quiz</button></a></li>
	</ul>
	
</body>
</html>