package javaHigh12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BoardUpdateEx {

	public static void main(String[] args) {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe", "system", "1234");
			System.out.println("연결 성공");

			String sql = "update boards set btitle=?, bcontent=?, bwriter=? where bno=?";
			PreparedStatement pstmt = conn.prepareStatement(sql);	// 연결된 곳으로 sql문장넣는다.
			pstmt.setString(1, "안녕");
			pstmt.setString(2, "나야");
			pstmt.setString(3, "익명");
			pstmt.setInt(4, 6);

			int rows = pstmt.executeUpdate();	// 데이터베이스에 insert문을 실행
			System.out.println("저장된 행 수 : " + rows);
			
			pstmt.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} // jdbc driver 등록
		finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
				}
			}
		}
	}
}