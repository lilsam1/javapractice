package mvc_school_db;

import java.sql.*;
import java.util.ArrayList;

import mvc_account._db.AccountDTO;

public class CourseDAO {
	private Connection connection = null;
	
	CourseDAO() {
		getConnection();
	}
	
	private void getConnection() {
		try {
			String url = "jdbc:mariadb://localhost:3308/sample_java_school";
			String user = "root";
			String password = "1475";
			
			try {
				Class.forName("org.mariadb.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			
			this.connection = DriverManager.getConnection(url, user, password);
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void disConnect() {	// 연결 해제
		try {
			if (connection != null) {
				connection.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
