<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>quiz </title>
<style>
	fieldset {
		display: inline-block;
	}
</style>
</head>

<body>
	<h1>quiz - controller</h1>
	<hr/>
	<%--
		quizController.java 	/quiz로 들어오는 요청을 처리하는 컨트롤러
								GET으로 요청 시 quiz.jsp로 포워드
								POST로 요청시 quiz_result.jsp로 포워드
								
		quiz.jsp				숫자 두개를 입력 받을 폼을 작성
								전송은 /quiz
								
		quiz_result.jsp			전달받은 두 정수의 합계를 출력
	 --%>
	 
	 <fieldset>
	 	<legend>입력 폼</legend>
	 	<%-- action이 빠지면 자기자신 주소으로 받는다. --%>
		 <form method="POST">
		 	<p><input name="num1" type="number" placeholder="숫자1 입력" required/></p>
		 	<p><input name="num2" type="number" placeholder="숫자2 입력" required/></p>
		 	<button>입력</button>
	 	</form>
	 </fieldset>
</body>
</html>