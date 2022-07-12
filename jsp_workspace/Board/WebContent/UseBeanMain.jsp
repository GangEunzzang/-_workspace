<%@page import="common.Person"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>자바빈 생성하기</h2>
	<jsp:useBean id="person" class="common.Person" scope="request"></jsp:useBean>
	
	<h3>자바빈 속성 값 변경하기</h3>
	<jsp:setProperty name="person" property="name" value="임꺽정"></jsp:setProperty>
	<jsp:setProperty name="person" property="age" value="41"></jsp:setProperty>
	
	<h3>자바빈 속성 값 읽기</h3>
	<jsp:getProperty name="person" property="name"/><br>
	<jsp:getProperty name="person" property="age" /><br>
	<%
	Person person1=new Person();
	person1.setName("이순신");
	person1.setAge(45);
	%>
	<%=person1.getName() %><br>
	<%=person1.getAge() %>
</body>
</html>