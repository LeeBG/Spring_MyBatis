<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp" %>

<form method="post">
	<input name="idx" type="number" hidden="hidden" value="${row.idx}">
	<p>Title : <input name="title" placeholder="제목 입력" value="${row.title }" required/></p>
	<p>Contents : <input name="contents" type="text" value="${row.contents }" placeholder="내용 입력" required/></p>
	<p>writer : <input name="writer" type="text" value="${row.writer }" placeholder="작성자 입력" required/></p>
	<p><button>작성완료</button></p>
</form>

</body>
</html>