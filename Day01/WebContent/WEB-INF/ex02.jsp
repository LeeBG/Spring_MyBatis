<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex02.jsp</title>
</head>
<body>
	<h1>MVC2</h1>
	<hr>
	
	<h3>MVC 패턴 2</h3>
	<p>WEB-INF 위치는 클라이언트에서 직접 접근이 불가능한 위치</p>
	
	<h4>Controller에서 받은 데이터 : ${test }</h4>
	
	<ul>
		<li>Servlet이라는 .java 파일이 요청/응답을 받아서 처리하고</li>
		<li>.jsp 파일에서 Servlet에서 처리한 결과를 화면에 출력한다</li>
		<li>각자의 역할이 나누어지게 되고 프로젝트가 복잡한 구조를 가지게 된다</li>
		<li>단, 역할이 분담되어 있기 때문에 가독성이 증가하고 유지보수가 증가</li>
		<li>따라서, 규모가 큰 프로젝트에 적합하다</li>
	</ul>
	
</body>
</html>