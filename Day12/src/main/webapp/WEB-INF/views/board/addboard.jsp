<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp" %>

<fieldset>
	<legend>게시글 입력</legend>
	<form method="post">
		<p>Title 	: <input name="title" placeholder="제목 입력" required/></p>
		<p>Contents : <textarea name="contents" rows="15" cols="40" required></textarea></p>
		<p>writer 	: <input name="writer" type="text" placeholder="작성자 입력" required/></p>
		<p><a href="${cpath }/"><button type="button">돌아가기</button></a> <button>작성완료</button></p>
	</form>
</fieldset>
</body>
</html>