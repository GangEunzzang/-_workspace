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
  <link rel="stylesheet" href="./css/style.css">
</head>
<body>
	
	<c:if test="${name == null}">
		<h2 class="title"> 안녕하세요 방가방가 </h2>
	
		<div class="content">
			<a href="./signup.lge" class="btn btn-primary">회원가입</a>
			<a href="./login.lge" class="btn btn-primary" style="margin-left:50px">로그인</a>
		</div>
	</c:if>
	<c:if test="${name != null}">
		<h2> {name} 회원님 안녕하세요</h2>
		
		<div class="content">
			<a href="#" class="btn btn-primary">로그아웃하기</a>
		</div>
		
	</c:if>
	
</body>
</html>