package mbcboard.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MemberDAO {

	public Connection conn;
	public PreparedStatement pstmt;
	public ResultSet rs;
	
	public MemberDAO() {
		try {
			// 예외가 발생할 수 있는 실행문
			// 프로그램 강제종료 처리용

			Class.forName("oracle.jdbc.driver.OracleDriver"); // 1단계 ojdbc6.jar 호출
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "boardtest",
					"boardtest"); // 2단계
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 이름이나, ojdbc6.jar 파일이 잘못 되었습니다.");
			e.printStackTrace();
			System.exit(0); // 강제 종료
		} catch (SQLException e) {
			System.out.println("url, id, pw가 잘못 되었습니다. BoardDAO에 기본생성자를 확인하세요");
			e.printStackTrace();
			System.exit(0); // 강제 종료
		}
	} // 기본 생성자 종료
	
	public int login(String mID, String mPW) {
		String sql = "select userPassword from user where user ID = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, mID);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				if(rs.getString(1).equals(mPW)) {
					return 1;
				} else  return 0;
				
			
			}
		return -1;
		}catch (SQLException e) {
			e.printStackTrace();
		}
	return -2;
	}
	
}
