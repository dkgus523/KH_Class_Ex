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
		//1. jvm �� Ŭ���� �ε� (Orable JDBC Driver)
				Class.forName("oracle.jdbc.driver.OracleDriver");  //����Ǵ� �ּҿ� �޸� �÷��� / jdbc ����̹� �ε�
				//2. ����̹� �Ŵ����κ��� Ŀ�ؼ� ����
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
