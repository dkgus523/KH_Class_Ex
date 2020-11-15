package prac01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Application3 {

	public static void main(String[] args) throws ClassNotFoundException {
		//1. jvm �� Ŭ���� �ε� (Orable JDBC Driver)
		Class.forName("oracle.jdbc.driver.OracleDriver");  //����Ǵ� �ּҿ� �޸� �÷��� / jdbc ����̹� �ε�
		//2. ����̹� �Ŵ����κ��� Ŀ�ؼ� ����
		try (final Connection conn = DriverManager.getConnection 
				("jdbc:oracle:thin:@localhost:1521:XE", "system", "oracle"); //�ּҿ��� �α���
				
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
