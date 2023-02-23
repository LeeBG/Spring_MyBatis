<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp" %>
<c:set var="user" value="${user }" scope="session" />

<%
	response.sendRedirect("${cpath}/");
%>

</body>
</html>