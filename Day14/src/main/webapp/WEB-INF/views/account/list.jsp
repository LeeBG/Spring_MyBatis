<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp" %>

<c:set var="list" value="${list }"/>
	<%-- 
		account 테이블에 계정 3개 이상을 추가하고
		이 페이지에 계정 목록을 모두 출력한다.
		
		AccountController.java아래 
		list() 메서드로 진행
	 --%>

	<table>
	  <tr>
	    <th>idx</th>
	    <th>userid</th>
	    <th>userpw</th>
	    <th>nick</th>
	    <th>email</th>
	    <th>username</th>
	    <th>join_date</th>
	  </tr>
	  <c:forEach var="row" items="${list }">		  
		  <tr>
		    <td>${row.idx }</td>
		    <td>${row.userid }</td>
		    <td>${row.userpw }</td>
		    <td>${row.nick }</td>
		    <td>${row.email }</td>
		    <td>${row.username }</td>
		    <td>${row.join_date }</td>
		  </tr>
	  </c:forEach>
	</table>
	<p><button onclick="javascript:history.go(-1)">이전 페이지</button></p>
</body>
</html>