<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp" %>

	<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
	
<div class="container pt-3">
	
	<h2>유저 리스트</h2>

	<table class="table table-dark table-striped">
		<tr>
			<th>idx</th>
			<th>아이디</th>
			<th>패스워드</th>
			<th>닉네임</th>
			<th>이메일</th>
			<th>이름</th>
			<th>가입일</th>
		</tr>
		
		<c:forEach var="row" items="${list }">
			<tr>
				<td>${row.idx }</td>
				<td>${row.userid }</td>
				<td>
					${fn:substring(row.userpw,0,10) }
					<%-- fn JSTL은 EL로 사용할 수 있다. --%>
					<%-- substring은(데이터,start,end) --%>
				</td>
				<td>${row.nick }</td>
				<td>${row.email }</td>
				<td>${row.username }</td>
				<td>${row.join_date }</td>
			</tr>
		</c:forEach>
	</table>
</div>