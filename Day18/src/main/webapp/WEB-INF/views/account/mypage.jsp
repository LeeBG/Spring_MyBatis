<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp" %>
<div class="container pt-3">
	<h2>${user.nick } 님 정보</h2>
	<form action="${cpath }/account/update/${user.idx}" method="POST">
		<div class="form-group">
			<table>
				<tr>
					<th>idx</th>
					<td><input class="form-control" name="idx" value="${user.idx }" readonly required></td>
				</tr>
				<tr>
					<th>아이디</th>
					<td><input class="form-control" name="userid" value="${user.userid }" readonly required></td>
				</tr>
				<tr>
					<th>비밀번호</th>
					<td><input class="form-control" type="password" name="userpw" required></td>
				</tr>
				<tr>
					<th>닉네임</th>
					<td><input class="form-control" name="nick" value="${user.nick }" readonly required></td>
				</tr>
				<tr>
					<th>이메일</th>
					<td><input class="form-control" type="email"  name="email" value="${user.email }" required></td>
				</tr>
				<tr>
					<th>이름</th>
					<td><input class="form-control" name="username" value="${user.username }" readonly required></td>
				</tr>
			</table>
		</div>
		<button type="submit" class="btn btn-warning">수정하기</button>
		<button onclick="confirmDelete(${user.idx})" type="button" class="btn btn-danger">탈퇴하기</button>
	</form>
</div>

<script>
	function confirmDelete(idx){
		var isDelete = confirm('정말로 탈퇴하시겠습니까??');
		
		if(isDelete === true ){
			location.href='${cpath}/account/delete/'+idx;
		}else{
			alert('탈퇴 취소 하였습니다');
			history.reload();
		}
	}
</script>

<%@ include file="../layout/footer.jsp" %>