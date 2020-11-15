package prac01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;

public class Application4 {

	public static void main(String[] args) throws ClassNotFoundException {
		//1. jvm �� Ŭ���� �ε� (Orable JDBC Driver)
				Class.forName("oracle.jdbc.driver.OracleDriver");  //����Ǵ� �ּҿ� �޸� �÷��� / jdbc ����̹� �ε�
				//2. ����̹� �Ŵ����κ��� Ŀ�ؼ� ����
				try (final Connection conn = DriverManager.getConnection 
						("jdbc:oracle:thin:@localhost:1521:XE", "system", "oracle"); //�ּҿ��� �α���
						
						) {
								final String sql = "select * from jdbc_example where id = 2";
								final PreparedStatement pstmt = conn.prepareStatement(sql);
								final ResultSet  rs = pstmt.executeQuery();
								rs.next();
								final int id = rs.getInt("id");
								final String name = rs.getString("name");
								final LocalDateTime localDateTime = rs.getTimestamp("time").toLocalDateTime();
								final String email = rs.getString("email");
								System.out.println(id);
								System.out.println(name);
								System.out.println(localDateTime);
								System.out.println(email);
							
				} catch (SQLException e) {
					e.printStackTrace();
				}
	}

}
