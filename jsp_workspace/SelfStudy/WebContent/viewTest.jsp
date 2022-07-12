<%@ page import="java.sql.PreparedStatement" %>
<%@ page import ="java.sql.ResultSet" %>
<%@ page import ="java.sql.Statement" %>
<%@ page import ="java.sql.Connection" %>
<%@ page import ="java.sql.Date" %>
<%@ page import ="common.JDBConnect" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<%
	JDBConnect jdbc = new JDBConnect();
	
	// 쿼리문 생성
	String sql = "select * from member";
	Statement stmt = jdbc.con.createStatement();
	
	// 쿼리 수행
	ResultSet rs = stmt.executeQuery(sql);
	
	// 결과 확인
	while(rs.next()){
		String id = rs.getString("id");
		String pw = rs.getString("pw");
		String name = rs.getString("name");
		String email = rs.getString("email");
		Date regidate = rs.getDate("regidate");
	
	out.println(String.format("%s %s %s %s %s", id,pw,name,email,regidate) +"<br/>");
	}
	
	jdbc.close();
	
	
	%>
		
</body>
</html>