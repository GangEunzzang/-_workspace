<%@ page import="java.sql.PreparedStatement" %>
<%@ page import ="java.sql.Connection" %>
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
	<h2> 회원 추가 테스트</h2>
	<%
	JDBConnect jdbc = new JDBConnect();
		
	//테스트 데이터 준비
	
	String id = "smj1";
	String pw = "1234";
	String name ="신민재";
	String email ="m56o_o";
	
	// 쿼리문 생성
	String sql = "insert into member values(?,?,?,?,sysdate)";
	PreparedStatement psmt = jdbc.con.prepareStatement(sql);
	psmt.setString(1,id);
	psmt.setString(2,pw);
	psmt.setString(3,name);
	psmt.setString(4,email);
	
	// 쿼리 수행
	int inResult = psmt.executeUpdate();
	out.println(inResult + "행이 입력되었습니다.");
	
	// 연결 닫기
	jdbc.close();
	
	%>
</body>
</html>