<%@page import="common.DBConnPool"%>
<%@page import="common.JDBConnect"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>JDBC테스트</h2>
<%

	JDBConnect jdbc1=new JDBConnect();
	jdbc1.close();

//DBConnPool pool=new DBConnPool();
//작업...
//pool.close();
%>	
</body>
</html>