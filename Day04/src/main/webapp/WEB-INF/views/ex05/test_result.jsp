<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>
	<table>
	<c:forEach var="obj" items="${map }">
		<tr>
			<th>${obj.key }</th>
			<td>${obj.value }</td>
		</tr>
	</c:forEach>
		
		
	</table>
</body>
</html>