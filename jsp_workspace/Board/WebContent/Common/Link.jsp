<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<table border="1" width="100%">
	<tr>
		<td align="center">
		
		<%if(session.getAttribute("UserId")==null){ %>
			<a href="LoginForm.jsp">로그인</a>				
		<%}else{%>
			<a href="Logout.jsp">로그아웃</a>
		<%} %>
			
			<span style="padding-left:20px;">
				<a href="List.jsp">게시판(페이징O)</a>
			</span>
		</td>
		
	</tr>
</table>