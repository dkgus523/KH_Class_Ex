package prac01;

import java.sql.Connection;  // 데이터베이스 연결
import java.sql.DriverManager; 
import java.sql.PreparedStatement; // sql문 작성
import java.sql.ResultSet; //sql문 실행 및 결과처리
import java.sql.SQLException;

public class Application {

	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("oracle.jdbc.driver.OracleDriver");  //실행되는 주소에 메모리 올려줌 / jdbc 드라이버 로딩
		try (final Connection conn = DriverManager.getConnection 
				("jdbc:oracle:thin:@localhost:1521:XE", "system", "oracle"); //주소에서 로그인
				final PreparedStatement pstmt =  
						conn.prepareStatement("SELECT 1 FROM dual");  //조회문으로 실행
				) {
			final ResultSet rs = 
					pstmt.executeQuery();
			rs.next();
			int value = rs.getInt(1);
			System.out.println(value);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
