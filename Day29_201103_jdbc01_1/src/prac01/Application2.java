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
		//1. jvm �� Ŭ���� �ε� (Orable JDBC Driver)
				Class.forName("oracle.jdbc.driver.OracleDriver");  //����Ǵ� �ּҿ� �޸� �÷��� / jdbc ����̹� �ε�
				//2. ����̹� �Ŵ����κ��� Ŀ�ؼ� ����
				try (final Connection conn = DriverManager.getConnection 
						("jdbc:oracle:thin:@localhost:1521:XE", "system", "oracle"); //�ּҿ��� �α���
						
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
