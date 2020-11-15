package prac01;

import java.sql.Connection;  // �����ͺ��̽� ����
import java.sql.DriverManager; 
import java.sql.PreparedStatement; // sql�� �ۼ�
import java.sql.ResultSet; //sql�� ���� �� ���ó��
import java.sql.SQLException;

public class Application {

	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("oracle.jdbc.driver.OracleDriver");  //����Ǵ� �ּҿ� �޸� �÷��� / jdbc ����̹� �ε�
		try (final Connection conn = DriverManager.getConnection 
				("jdbc:oracle:thin:@localhost:1521:XE", "system", "oracle"); //�ּҿ��� �α���
				final PreparedStatement pstmt =  
						conn.prepareStatement("SELECT 1 FROM dual");  //��ȸ������ ����
				) {
			final ResultSet rs = 
					pstmt.executeQuery();
			rs.next();
			int value = rs.getInt(1);
			System.out.println(value);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
