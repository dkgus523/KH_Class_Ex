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
		//1. jvm �� Ŭ���� �ε� (Orable JDBC Driver)
		Class.forName("oracle.jdbc.driver.OracleDriver");  //����Ǵ� �ּҿ� �޸� �÷��� / jdbc ����̹� �ε�
		//2. ����̹� �Ŵ����κ��� Ŀ�ؼ� ����
		try (final Connection conn = DriverManager.getConnection 
				("jdbc:oracle:thin:@localhost:1521:XE", "system", "oracle"); //�ּҿ��� �α���
				
				) {
						final String sql = "select * from jdbc_example";
						final PreparedStatement pstmt = conn.prepareStatement(sql);
						final ResultSet rs = pstmt.executeQuery(); //�� ���� ����Ű�� resultset
						
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
