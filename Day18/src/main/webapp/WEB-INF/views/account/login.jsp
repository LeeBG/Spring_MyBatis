<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>
<div class="container pt-3">
	<form action="${cpath }/account/login" method="post">
		<h2>로그인</h2>
	
		<div class="form-group">
			<input type="text" name="userid" id="userid" class="form-control"
				placeholder="Enter UserId" required />
		</div>
	
		<div class="form-group">
			<input type="password" name="userpw" class="form-control"
				placeholder="Enter Password" required />
		</div>
	
		<br />
		<button type="submit" class="btn btn-primary">로그인</button>
		<a href="${cpath }/account/join">
			<button type="button" class="btn btn-primary">회원가입</button>
		</a>
		<a href="${cpath }/account/findid">
			<button type="button" class="btn btn-primary">아이디 찾기</button>
		</a>
		<a href="${cpath }/account/findpw">
			<button type="button" class="btn btn-primary">비밀번호 찾기</button>
		</a>
	
	</form>
	
</div>
<%@ include file="../layout/footer.jsp"%>