<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
	<h1>BOOK</h1>
	<hr/>
	<h3>${test }</h3>
	<fieldset>
		<legend>Book Table</legend>
		<table>
			<tr>
				<th>idx</th>
				<th>제목</th>
				<th>작가</th>
				<th>출판사</th>
				<th>출판일자</th>
				<th>가격</th>
				<th>수정</th>
				<th>삭제</th>
			</tr>
			<c:forEach var="row" items="${list }">
			<tr>
				<td>${row.idx }</td>
				<td>${row.title }</td>
				<td>${row.writer }</td>
				<td>${row.publisher }</td>
				<td>${row.publish_date }</td>
				<td>${row.price}</td>
				<th><a href="${cpath }/book/update/${row.idx}">수정</a></td>
				<th onclick="del(${row.idx})">X</th>
			</tr>
			</c:forEach>
		</table>
	</fieldset>
	
	<script>
		function del(idx){
			
			var isDel = confirm('삭제 하시겠습니까?');
			
			if(isDel == true ) {
				location.href = '${cpath}/book/delete/' + idx;
			}
		}
	</script>
</body>
</html>