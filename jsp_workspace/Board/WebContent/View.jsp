<%@ page import ="model1.board.BoardDAO" %>
<%@ page import ="model1.board.BoardDTO" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
String num = request.getParameter("num"); //일련번호 받기

BoardDAO dao = new BoardDAO(application); //DAO 생성
dao.updateVisitCount(num); //조회수 증가
BoardDTO dto = dao.selectView(num); // 게시물 가져오기
dao.close(); // DB 연결 해제
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="Common/Link.jsp"/>
<h2> 회원제 게시판 - 상세보기(View)</h2>
<form name="writeFrm">
	<input type ="hidden" name ="num" value="<%=num %>" />
</form>
</body>
</html>