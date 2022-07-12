<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
  <link rel="stylesheet" href="/css/style.css">
<script type="text/javascript">
	function validateForm(form){
		if(form.pass.value == ""){
			alert("비밀번호를 입력하세요.");
			form.pass.focus();
			return false;
		}
	}
</script>
</head>
<body>
<div class="container">
<h2 style="margin-top:70px"> 비밀번호 검증(Pass)</h2>
<form name ="writeFrm" method="post" action="../mvcboard/pass.do" onsubmit="return validateForm(this);">
	<input type="hidden" name="idx" value="${param.idx }"/>
	<input type="hidden" name="mode" value="${param.mode }" />
	<table  width="100%" class="table"  style="margin-top:50px">
		<tr>
			<td class="bg-color4">비밀번호</td>
			<td> <input type="password"   class="form-control" name="pass" style="width:150px;"/> </td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<button type="submit" class="btn btn-primary">검증하기</button>
				<button type="reset" class="btn btn-primary">RESET</button>
				<button type="button"  class="btn btn-primary"onclick="location.href ='../mvcboard/list.do';">목록 바로가기</button>
			</td>
		</tr>
	</table>
</form>
</div>
</body>
</html>