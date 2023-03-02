<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>
<div class="container pt-3">
	<form action="${cpath }/account/join" method="POST">
		<div class="form-group">
			<input type="text" name="userid" id="userid" class="form-control"
				placeholder="Enter UserId" required />
		</div>

		<div class="form-group">
			<input type="password" name="userpw" id="userpw" class="form-control"
				placeholder="Enter Userpw" required />
		</div>

		<div class="form-group">
			<input type="text" name="nick" id="nick" class="form-control"
				placeholder="Enter Nick" required />
		</div>

		<div class="form-group">
			<input type="text" name="username" id="username" class="form-control"
				placeholder="Enter Name" required />
		</div>

		<div class="form-group">
			<input type="email" name="email" class="form-control"
				placeholder="Enter Email" required />
		</div>

		<br />
		<button type="submit" class="btn btn-primary">회원가입완료</button>
	</form>
	<script>
		function 
	</script>
</div>
<%@ include file="../layout/footer.jsp"%>