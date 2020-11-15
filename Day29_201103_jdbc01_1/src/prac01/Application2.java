package prac01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;

public class Application2 {

	public static void main(String[] args) throws ClassNotFoundException {
		//1. jvm 에 클래스 로드 (Orable JDBC Driver)
				Class.forName("oracle.jdbc.driver.OracleDriver");  //실행되는 주소에 메모리 올려줌 / jdbc 드라이버 로딩
				//2. 드라이버 매니저로부터 커넥션 얻어옴
				try (final Connection conn = DriverManager.getConnection 
						("jdbc:oracle:thin:@localhost:1521:XE", "system", "oracle"); //주소에서 로그인
						
						) {
							 String name = "abc"; 
							 String sqlFormat = "insert into jdbc_example values(seq_jdbc_example_pk.nextval, 'ah', default)"; 
							 String sql = String.format(sqlFormat, name); 
							 Statement statement = conn.createStatement(); 
							 final int affectedRows = statement.executeUpdate(sql); 
							 System.out.println(affectedRows);
							 
				} catch (SQLException e) {
					e.printStackTrace();
				}
				
				

	}

}
