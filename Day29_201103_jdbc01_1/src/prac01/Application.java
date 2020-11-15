package prac01;

import java.sql.Connection;  // �����ͺ��̽� ����
import java.sql.DriverManager; 
import java.sql.PreparedStatement; // sql�� �ۼ�
import java.sql.ResultSet; //sql�� ���� �� ���ó��
import java.sql.SQLException;

public class Application {

	public static void main(String[] args) throws ClassNotFoundException {
		//1. jvm �� Ŭ���� �ε� (Orable JDBC Driver)
		Class.forName("oracle.jdbc.driver.OracleDriver");  //����Ǵ� �ּҿ� �޸� �÷��� / jdbc ����̹� �ε�
		//2. ����̹� �Ŵ����κ��� Ŀ�ؼ� ����
		try (final Connection conn = DriverManager.getConnection 
				("jdbc:oracle:thin:@localhost:1521:XE", "system", "oracle"); //�ּҿ��� �α���
				//3. �����ͺ��̽� �۾�
				final PreparedStatement pstmt =  
						conn.prepareStatement("SELECT 1 FROM dual");  //��ȸ������ ����
				) {
			final ResultSet rs =   //query ����� ��� ��ü
					pstmt.executeQuery();  //query ����
			rs.next();
			int value = rs.getInt(1);
			System.out.println(value);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}

}
