<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="./IsLoggedIn.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원제 게시판</title>
 <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
<script type="text/javascript">
function validateForm(form) { //폼내용 검증
	if (form.title.value == ""){
		alert("제목을 입력하세요.");
		form.title.focus();
		return false;
	}
	if (form.content.value == ""){
		alert("내용을 입력하세요.");
		form.content.focus();
		return false;
	}
}
</script>

</head>
<body>
<jsp:include page="Common/Link.jsp"/>
<h2 style="text-align:center; margin-top : 50px; color:blue;" > 회원제 게시판 - 글쓰기(Write) </h2>
<form name ="writeFrm" method="post" action="WriteProcess.jsp" onsubmit="return validateForm(this);">
	<table border ="1" class="table">
		<tr class="thead-dark">
			<td>제목</td>
			<td> <input type="text" name="title" style="width:90%" /> </td>
		</tr>
		<tr>
			<td>내용</td>
			<td> <textarea name="content" style="width: 90% ; height: 100px;"></textarea> </td>
		</tr>
		<tr>
			<td colspan ="2" align="center">
				<button type="submit"> 작성 완료</button>
				<button type="reset"> 다시 입력</button>
				<button type="button" onclick="location.href='list.jsp';"> 목록보기 </button>
			</td>
		</tr>
	</table>	
</form>
</body>
</html>