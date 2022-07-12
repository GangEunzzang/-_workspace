package member;

import java.sql.PreparedStatement;

import common.DBConnPool;
import common.JDBConnect;

public class MemberDAO extends DBConnPool {
	// 명시한 db의 연결이 완료된 memberDAO 객체 생성
	
	public MemberDAO() {
		super();
	}
	
	// 회원가입
	public int signUp(MemberDTO dto) {
		int result = 0;
		try {
			String query = "insert into member values(?,?,?,?,sysdate)";
			
			psmt = con.prepareStatement(query);
			psmt.setString(1, dto.getId());
			psmt.setString(2, dto.getPw());
			psmt.setString(3, dto.getName());
			psmt.setString(4, dto.getEmail());
			result = psmt.executeUpdate();		
		}catch(Exception e) {
			System.out.println("회원가입 중 예외 발생");
			e.printStackTrace();
		}
		return result;
	}
	
	// 로그인	
	public int login(String id, String pw) {
		int result = 0;
		MemberDTO dto = new MemberDTO();
		try {
			String query = "select * from member where id=? and pw=?";
			
			psmt = con.prepareStatement(query);
			psmt.setString(1, dto.getId());
			psmt.setString(2, dto.getPw());
			rs = psmt.executeQuery();
			
			if(rs.next()) {
				// 쿼리 결과로 얻은 회원정보를 dto 객체에 저장
				dto.setId(rs.getString("id"));
				dto.setPw(rs.getString("pw"));
				dto.setName(rs.getString("name"));
				dto.setEmail(rs.getString("email"));
				dto.setRegidate(rs.getString("regidate"));
			}
			
		}catch(Exception e) {
			System.out.println("로그인 중 예외 발생");
			e.printStackTrace();
		}
		return result;
	}
	
}
