<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/LifeCycle.do">
		<input type="submit" value="get방식전송">
	</form>
	
	<a href="/LifeCycle.do">get방식</a>
	<script>
		location.href="/LifeCycle.do";
	</script>
	<%
	response.sendRedirect("/LifeCycle.do");
	%>
</body>
</html>