package prac01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Application5 {

	public static void main(String[] args) throws ClassNotFoundException {
		//1. jvm 에 클래스 로드 (Orable JDBC Driver)
		Class.forName("oracle.jdbc.driver.OracleDriver");  //실행되는 주소에 메모리 올려줌 / jdbc 드라이버 로딩
		//2. 드라이버 매니저로부터 커넥션 얻어옴
		try (final Connection conn = DriverManager.getConnection 
				("jdbc:oracle:thin:@localhost:1521:XE", "system", "oracle"); //주소에서 로그인
				
				) {
						final String sql = "select * from jdbc_example";
						final PreparedStatement pstmt = conn.prepareStatement(sql);
						final ResultSet rs = pstmt.executeQuery(); //한 행을 가르키는 resultset
						
						List<JdbcExample> list = new ArrayList<>();
						while(rs.next()) {
							final JdbcExample jdbcExample = read(rs);
							list.add(jdbcExample);
						
						}
						for(JdbcExample jdbcExample : list) {
							System.out.println(jdbcExample);
						}
		} catch (SQLException e) {
			e.printStackTrace();
			}
	}	

	private static JdbcExample read(ResultSet rs) throws SQLException {
		final long id = rs.getLong("id");
		final String name = rs.getString("name");
		final LocalDateTime time = rs.getTimestamp("time").toLocalDateTime();
		final String email = rs.getString("email");
		return new JdbcExample(id,name, time, email);

	
	}

}
