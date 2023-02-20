<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>


<fieldset>
	<legend>${list.title } 내용</legend>
	<table border=1 cellspacing="0" cellpadding="10">
		<tr>
			<th>IDX</th>
			<td>${list.idx}</td>
		</tr>
		<tr>
			<th>제목</th>
			<td>${list.title}</td>
		</tr>
		<tr>
			<th>내용</th>
			<td style="height: 300px"><pre>${list.contents}</pre></td>
		</tr>
		<tr>
			<th>작성자</th>
			<td>${list.writer}</td>
		</tr>
		<tr>
			<th>조회수</th>
			<td>${list.view_count}</td>
		</tr>
		<tr>
			<th>작성일</th>
			<td>${list.write_date}</td>
		</tr>
		<tr>
		<th><a href="${cpath }/"><button>돌아가기</button></a></th>
		<td>
			<a href="${cpath }/board/update/${list.idx}"><button>수정</button></a>
			<a href="${cpath }/board/delete/${list.idx}"><button>삭제</button></a>
		</td>
		</tr>
	</table>
</fieldset>
</body>
</html>