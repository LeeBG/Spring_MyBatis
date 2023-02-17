<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="layout/header.jsp" %>
	<h3>테스트</h3>
	<table>
		<tr>
			<th>idx</th>
			<th>제목</th>
			<th>작성자</th>
			<th>조회수</th>
			<th>작성일</th>
		</tr>
		
		<c:forEach var="row" items="${list }">
		<tr>
			<td>${row.idx }</td>
			<td>
				<a href="${cpath }/board/view/${row.idx}">${row.title }</a>
			</td>
			<td>${row.writer }</td>
			<td>${row.view_count }</td>
			<td>${row.write_date }</td>
		</tr>
		</c:forEach>
	</table>
	<a href="${cpath }/board/addboard"><button>글 쓰기</button></a>
</body>
</html>