<%@page import="java.util.List"%>
<%@page import="model1.board.BoardDTO"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<%@page import="model1.board.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
BoardDAO dao=new BoardDAO(application);
Map<String, Object> param=new HashMap<String, Object>();
String searchField=request.getParameter("searchField");
String searchWord=request.getParameter("searchWord");
if(searchWord!=null){
	param.put("searchField",searchField);
	param.put("searchWord",searchWord);
}
int totalCount=dao.selectCount(param);
List<BoardDTO> boardLists=dao.selectList(param);
dao.close();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<div class="container">
	<jsp:include page="Common/Link.jsp"/>
	<h2>목록보기</h2>
	<form method="get">
		<div style="text-align:center;">
			<select name="searchField">
				<option value="title">제목</option>
				<option value="content">내용</option>
			</select>
			<input type="text" name="searchWord" />
			<input type="submit" value="검색하기" />
		</div>
	</form>
	<table border="1" class="table">
		<tr class="thead-dark">
			<th width="10%">번호</th>
			<th width="50%">제목</th>
			<th width="15%">작성자</th>
			<th width="10%">조회수</th>
			<th width="15%">작성일</th>
		</tr>
<%
if(boardLists.isEmpty()){%>
	<tr>
		<td colspan="5" align="center">
			등록된 게시물이 없습니다.
		</td>
	</tr>
<%
}else{
	int virtualNum=0;
	for(BoardDTO dto : boardLists){
		virtualNum = totalCount--;
%>
	<tr align="center">
		<td><%=virtualNum %></td>
		<td style="text-align:left;">
			<a href="View.jsp?num=<%=dto.getNum()%>"><%=dto.getTitle() %></a>
		</td>
		<td>
			<%=dto.getId()%>
		</td>
		<td>
			<%=dto.getVisitcount() %>
		</td>
		<td>
			<%=dto.getPostdate() %>
		</td>
	</tr>	
<%		
	}
	
}
%>		
	</table>
	<div style="text-align:right;">
		<button type="button" onclick="location.href='Write.jsp';">글쓰기</button>
	</div>
</div>
</body>	
</html>