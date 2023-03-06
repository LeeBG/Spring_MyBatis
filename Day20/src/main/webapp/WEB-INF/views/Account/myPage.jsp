<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

	<form method="POST" enctype="multipart/form-data">
		<table id="profile">
			<tr>
				<td rowspan="2">
					<img src="${cpath }/${user.profile }" width="50px">
				</td>
				<td>${user.userid }</td>
			</tr>
			
			<tr>
				<td>${user.nick }</td>
			</tr>
			
			<tr>
				<th>패스워드</th>
				<td><input name="userpw" type="password" required></td>
			</tr>
			
			<tr>
				<th>성함</th>
				<td>${user.username }</td>
			</tr>
			
			<tr>
				<th>이메일</th>
				<td><input name="email" type="email" required value="${user.email }"></td>
			</tr>
			
			<tr>
				<th>가입일</th>
				<td>${user.join_date }</td>
			</tr>
		</table>
		
		<p>
			<label for="pro">프로필 변경 : </label>
			<input id="pro" name="file" type="file">
		</p>
		
		<input name="userid" type="hidden" value="${user.userid }">
		
		<button>수정</button>
	</form>

</body>
</html>