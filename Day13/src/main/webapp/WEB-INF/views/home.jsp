<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="layout/header.jsp" %>
	<c:set var="list" value="${map['list'] }"/>
	<c:set var="page" value="${map['page'] }"/>
	<h3>Day12 - Day10, Day11 와 이어집니다!!</h3>
	<table>
		<tr>
			<th>idx</th>
			<th>제목</th>
			<th>작성자</th>
			<th>조회수</th>
			<th>작성일</th>
			<th>수정</th>
			<th>삭제</th>
		</tr>
		
		<c:forEach var="row" items="${list }">
		<tr>
			<td>${row.idx }</td>
			<td>
				<a style="color:blue" href="${cpath }/board/view/${row.idx}">${row.title }</a>
			</td>
			<td>${row.writer }</td>
			<td>${row.view_count }</td>
			<td>${row.write_date }</td>
			<td><a style="color:orange;" href="${cpath }/board/update/${row.idx}">수정</a></td>
			<td><a style="color:red;" onclick="checkDelete(${row.idx})" >X</a></td>
		</tr>
		</c:forEach>
	</table>
	<br/>
	
	<div class="page-box">
		<ul>
			<!-- Previous Page and Section -->
			<c:if test="${page.isPrev }">
				<li><a href="${cpath }/?reqPage=${page.begin - 1 }">⏪</a></li>
			</c:if>
			<c:if test="${param.reqPage > 1 }">
				<li><a href="${cpath }/?reqPage=${param.reqPage -1}">⬅</a></li>
			</c:if>
			
			<!-- 페이지 항목 -->
		  	<c:forEach var="i" begin="${page.begin }" end="${page.end }">
		  		<c:choose>
			  		<c:when test="${param.reqPage == i }">
			  			<li><a style="color:red" href="${cpath }/?reqPage=${i }">${i }</a></li>
			  		</c:when>
			  		<c:otherwise>
			  			<li><a style="color:blue" href="${cpath }/?reqPage=${i }">${i }</a></li>
			  		</c:otherwise>
		  		</c:choose>
		  	</c:forEach>
		  	
		  	<!-- Next Page and Section -->
		  	<c:if test="${param.reqPage < page.totalPage }">
				<li><a href="${cpath }/?reqPage=${param.reqPage +1}">➡</a></li>
			</c:if>
		  	<c:if test="${page.isNext}">
				<li><a href="${cpath }/?reqPage=${page.end + 1 }">⏩</a></li>
			</c:if>
		</ul>
	</div>
	
	<form action="${cpath }/board/search">
		<select name="type">
			<option value="title">제목</option>
			<option value="contents">내용</option>
			<option value="writer">작성자</option>
		</select>
	
		<input name="search" type="search">
		<input name="reqPage" type="hidden" value="1">
		<button>검색</button>
	</form>
	
	<a href="${cpath }/board/addboard"><button>글 쓰기</button></a>
	
	<script>
		function checkDelete(idx){
			var result = confirm("정말로 삭제하시겠습니까??");
			
			if(result === true){
				location.href='${cpath }/board/delete/'+idx;
			}else{
				alert("취소되었습니다.")
				history.go(-1);
			}
		}
	</script>
</body>
</html>