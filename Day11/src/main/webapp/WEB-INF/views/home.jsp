<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="layout/header.jsp" %>
	<h3>Day11- Day10에서 이어집니다!!</h3>
	<table>
		<tr>
			<th>idx</th>
			<th>제목</th>
			<th>작성자</th>
			<th>조회수</th>
			<th>작성일</th>
			<th>수정</th>
			<th>삭제</th>
		</tr>
		
		<c:forEach var="row" items="${list }">
		<tr>
			<td>${row.idx }</td>
			<td>
				<a style="color:blue" href="${cpath }/board/view/${row.idx}">${row.title }</a>
			</td>
			<td>${row.writer }</td>
			<td>${row.view_count }</td>
			<td>${row.write_date }</td>
			<td><a style="color:orange;" href="${cpath }/board/update/${row.idx}">수정</a></td>
			<td><a style="color:red;" href="${cpath }/board/delete/${row.idx}">X</a></td>
		</tr>
		</c:forEach>
	</table>
	<br/>
	<form action="${cpath }/board/search">
		<select name="type">
			<option value="title">제목</option>
			<option value="contents">내용</option>
			<option value="writer">작성자</option>
		</select>
	
		<input name="search" type="search">
		<button>검색</button>
	</form>
	
	<a href="${cpath }/board/addboard"><button>글 쓰기</button></a>
</body>
</html>