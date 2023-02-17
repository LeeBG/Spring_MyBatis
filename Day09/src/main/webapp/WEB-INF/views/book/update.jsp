<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp"%>

<h3>책 수정</h3>
<form method="post">
	<p><input name="title" type="text" value="${row.title }" required></p>
	<p><input name="writer" type="text" placeholder="저자 입력" value="${row.writer }" required></p>
	<p><input name="publisher" placeholder="출판사 입력" value="${row.publisher }" required></p>
	<p>출판일 : <input name="publish_date" type="date" placeholder="출판일"  value="${row.publish_date }" required></p>
	<p><input name="price" type=number placeholder="가격" value="${row.price }" required></p>
	
	<button>수정 완료</button>
</form>

</body>
</html>