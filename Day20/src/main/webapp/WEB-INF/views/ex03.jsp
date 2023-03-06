<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

	<h3>파일 목록</h3>
	
	<ul>
		<c:forEach var="file" items="${list }">
		<li>
			<a href="${cpath }/upload/${file }" download>
				${file }
			</a>
		</li>
		</c:forEach>
	</ul>
	
	
	<fieldset>
		<legend>업로드</legend>
	
		<form method="POST" enctype="multipart/form-data">
			<p><input name="file" type="file"></p>
			<p><input name="meno" placeholder="메모"></p>
			
			<button>전송</button>
		</form>
	</fieldset>

</body>
</html>