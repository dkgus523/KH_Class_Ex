package prac01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Application3 {

	public static void main(String[] args) throws ClassNotFoundException {
		//1. jvm 에 클래스 로드 (Orable JDBC Driver)
		Class.forName("oracle.jdbc.driver.OracleDriver");  //실행되는 주소에 메모리 올려줌 / jdbc 드라이버 로딩
		//2. 드라이버 매니저로부터 커넥션 얻어옴
		try (final Connection conn = DriverManager.getConnection 
				("jdbc:oracle:thin:@localhost:1521:XE", "system", "oracle"); //주소에서 로그인
				
				) {
			
					final String name = "abc";					
					final String email = "a@a.com";					
					final String sql = "insert into jdbc_example values(seq_jdbc_example_pk.nextval,?, default, ?)";		
					final PreparedStatement pstmt = conn.prepareStatement(sql);		
					pstmt.setString(1, name);				
					pstmt.setString(2, email);					
					final int affectedRows = pstmt.executeUpdate();				
					System.out.println(affectedRows);
					
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
