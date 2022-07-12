package member;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login.lge")
public class LoginController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/Login.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 폼값 받아와서
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		MemberDTO dto = new MemberDTO();
		dto.setId(id);
		dto.setPw(pw);
		
		MemberDAO dao = new MemberDAO();
		int result = dao.login(dto);
		
		String memberName = dto.getName();
		
		if(dto.getId()!= null) {
			System.out.println("로그인 성공");
			HttpSession session = request.getSession();
			session.setAttribute("name", memberName);
			request.getRequestDispatcher("/index.jsp").forward(request, response);
		}else {
			System.out.println("로그인 실패");
		}
		
		
		dao.close();
	}

}
