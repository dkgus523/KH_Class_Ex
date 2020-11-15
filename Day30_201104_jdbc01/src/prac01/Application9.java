package prac01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Application9 {
	
	String JDBC_URL = "jdbc:oracle:thin:@localhost:1521:XE";
	String DB_USER ="system";
	String DB_PASS = "oracle";
	public static void main(String[] args) throws ClassNotFoundException {
		
		//1. Ŭ���� �ε�
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//2. DB���� 
		try (final Connection conn = DriverManager.getConnection("JDBC_URL", "DB_USER", "DB_PASS")) {
			final String sql = "select empno, ename, job from emp";
			final PreparedStatement pstmt = conn.prepareStatement(sql);
			final ResultSet  rs = pstmt.executeQuery();
			while(rs.next()) {
				final int empno = rs.getInt("empno");
				final String ename = rs.getString("ename");
				final String job = rs.getString("job");
				System.out.println(empno);
				System.out.println(ename);
				System.out.println(job);
			}
		} catch (SQLException throwables) {
			throwables.printStackTrace();
		}
	}

}
