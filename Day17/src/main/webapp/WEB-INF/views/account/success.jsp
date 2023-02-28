<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>

	<script>
		alert('${msg}');
		location.href= '${cpath}/';
	</script>
	
<%@ include file="../layout/footer.jsp" %>