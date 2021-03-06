package prac01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Application7 {
    private static final String JDBC_URL = "jdbc:oracle:thin:@localhost:1521:XE";
    private static final String DB_USER = "system";
    private static final String DB_PASS = "oracle";

    public static void main(String[] args) throws ClassNotFoundException {
        // 1. 클래스 로드
        Class.forName("oracle.jdbc.driver.OracleDriver");

        // 2. 데이터베이스에 접속
        Connection conn = null;
        try {
        		conn = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS);
        		conn.setAutoCommit(true);
        		
        		String sql1 = "update bank_account set money=0 where username='A'";
        		String sql2 = "update bank_account set money=1000 where username='B'";
        		
        		//A의 계좌를 0으로
        		final PreparedStatement pstmt1 = conn.prepareStatement(sql1);
        		final int affectedRows1 = pstmt1 .executeUpdate();
        		System.out.println("1 : " + affectedRows1);
        		
        		        		
        		//B의 계좌를 1000으로
        		final PreparedStatement pstmt2 = conn.prepareStatement(sql2);
        		final int affectedRows2 = pstmt2 .executeUpdate();
        		System.out.println("2 : " + affectedRows2);
        		
        		conn.commit();
        		conn.setAutoCommit(true);
        } catch (SQLException throwables) {
        	if (conn != null) {
        		try {
        			System.out.println("롤백");
        			conn.rollback();
        		} catch (SQLException e) {
        			e.printStackTrace();
        		}
        	}
            throwables.printStackTrace();
        } finally {
        	close(conn);
        }
    }
    
    private static void close(AutoCloseable closeable) {
    	try {
    		closeable.close();
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
    }
}
