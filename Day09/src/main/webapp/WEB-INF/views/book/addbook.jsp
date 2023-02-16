<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp"%>

<h3>책 추가</h3>
<form method="POST">
	<p><input name="title" placeholder="제목 입력" required></p>
	<p><input name="writer" placeholder="저자 입력" required></p>
	<p><input name="publisher" placeholder="출판사 입력" required></p>
	<p>출판일 : <input name="publish_date" type="date" placeholder="출판일" required></p>
	<p><input name="price" type=number placeholder="가격" required></p>
	
	<button>등록</button>
</form>

</body>
</html>