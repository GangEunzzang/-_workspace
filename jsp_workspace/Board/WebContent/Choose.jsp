<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	 
	<c:set var="number" value="99"/> <br>
	<c:choose	>
		<c:when test="${number mod 2 eq 0 }">
			${number }는 짝수 입니다.
		</c:when>
		<c:otherwise>
			${number}는 홀수 입니다.
		</c:otherwise>
	</c:choose>
</body>
</html>