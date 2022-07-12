import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCTest {

	public static void main(String[] args) {
		
		try {
			//oracle jdbc드라이버 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");// jdbc driver load
			//Connection
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ora_user","hong");// 연결
			System.out.println("연결완료");
		
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from student");
			while(rs.next()) {
				System.out.println(rs.getString("id"));
				System.out.println(rs.getString("name"));
				System.out.println(rs.getString("dept"));
			}

			
			rs.close();
			stmt.close();
			conn.close();
			
		}catch(Exception e) {
			
		}finally {}

	}

}
