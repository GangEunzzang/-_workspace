package member;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/signup.lge")
public class SignUpController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("출력성공");
		request.getRequestDispatcher("/SignUp.jsp").forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// DTO에 폼 데이터 값 입력
		MemberDTO dto = new MemberDTO();
		dto.setId(request.getParameter("id"));
		dto.setPw(request.getParameter("pw"));
		dto.setName(request.getParameter("name"));
		dto.setEmail(request.getParameter("email"));
		
		// DAO에 signup 메소드를 실행 및 영향받은 쿼리수 반환(result)
		MemberDAO dao = new MemberDAO();
		int result = dao.signUp(dto);
		dao.close();
		
		if(result ==1) {
			response.sendRedirect("/index.jsp");
		}else {
			response.sendRedirect("http://www.naver.com");
		}
	}

}
