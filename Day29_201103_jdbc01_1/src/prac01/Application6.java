package prac01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Application6 {

	public static void main(String[] args) throws ClassNotFoundException {
		//1. jvm 에 클래스 로드 (Orable JDBC Driver)
				Class.forName("oracle.jdbc.driver.OracleDriver");  //실행되는 주소에 메모리 올려줌 / jdbc 드라이버 로딩
				//2. 드라이버 매니저로부터 커넥션 얻어옴
				try (final Connection conn = DriverManager.getConnection 
						("jdbc:oracle:thin:@localhost:1521:XE", "system", "oracle") ) {
						final String sql = "delete from jdbc_example where id < 2";
						final PreparedStatement pstmt = conn.prepareStatement(sql);
						final int affectedRows = pstmt.executeUpdate();
						System.out.println(affectedRows);
				} catch (SQLException e) {
					e.printStackTrace();
				}
			

	}

}
