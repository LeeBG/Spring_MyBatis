<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp" %>
<fieldset>
	<legend>${row.title} 수정</legend>
	<form method="POST">
		<input name="idx" type="number" hidden="hidden" value="${row.idx}">
		<p>Title : <input name="title" type="text" placeholder="제목 입력" value="${row.title }" required/></p>
		<p>Contents : <textarea name="contents" rows="15" cols="40" required>${row.contents }</textarea></p>
		<p>writer : <input name="writer" type="text" value="${row.writer }" placeholder="작성자 입력" required/></p>
		<p><a href="javascript:history.go(-1);"><button type="button">이전으로</button></a> <button>수정 완료</button></p>
		
	</form>
</fieldset>
</body>
</html>