<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp" %>

	<h4> 약관 동의 </h4>
	
	<form>
		<textarea readonly>${agree }</textarea>
		
		<p>동의합니다 <input name="agree" type="checkbox" value="yes"></p>
		<button>다음</button>
	</form>
</html>