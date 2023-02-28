<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>

<fieldset>
	<legend>내 정보</legend>
	<form action="${cpath }/account/update/${user.idx}" method="POST">
		<p>
			<input name="idx" placeholder="idx" value="${user.idx }" required
				readonly/>
		</p>
		<p>
			<input name="userid" placeholder="id입력" value="${user.userid }"
				required readonly/>
		</p>
		<p>
			<input name="userpw" placeholder="pw입력" value="${user.userpw }"
				required />
		</p>
		<p>
			<input name="nick" placeholder="닉네임 입력" value="${user.nick }"
				required readonly/>
		</p>
		<p>
			<input name="email" type="email" placeholder="이메일 입력"
				value="${user.email }" required/>
		</p>
		<p>
			<input name="username" type="text" placeholder="이름 입력"
				value="${user.username }" required readonly/>
		</p>
		<p>
			<input name="join_date" type="date" value="${user.join_date }"
				required readonly/>
		</p>
		
		<p>
			<button>회원수정</button>
		</p>
		<p>
			<button onclick="checkDelete(${user.idx })" type="button">회원 탈퇴</button>
		</p>
		
	</form>
	<p>
		<button onclick="javascript:history.go(-1)">이전 페이지</button>
	</p>
</fieldset>
<script>
	function checkDelete(idx) {
		var result = confirm("[주의!!] 정말로 삭제하시겠습니까??");

		if (result === true) {
			location.href = '${cpath }/account/delete/' + idx;
		} else {
			alert("취소되었습니다.")
			history.reload();
		}
	}
</script>
<%@ include file="../layout/footer.jsp"%>