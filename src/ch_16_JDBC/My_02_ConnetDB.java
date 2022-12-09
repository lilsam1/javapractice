package ch_16_JDBC;

import java.sql.*;

/* DBMS�� ����
 java.sql ��Ű���� �����ϴ� Connection ��ü�� ���
 Connection ��ü�� ���� java.sql ��Ű���� ���ԵǾ� �ִ� DriverManager Ŭ������ getConnection() �޼��带 �̿�
 getConnection(String url, String user, String password) �޼���� static �޼���μ�
 url�� ������ �����ͺ��̽� ��ġ�� ��Ÿ����, user�� ����� ���� ���̵�, password�� ���� ��й�ȣ�� ����
 */

class DB {
	Connection conn = null;
	PreparedStatement preparedStatement = null;
	ResultSet resultSet = null;	// �����ÿ� ����� �����ϴ� �뵵�� ���. select�� �ַ� ���
	
	public void connectDB() {
		final String driver = "org.mariadb.jdbc.Driver";
		final String DB_HOST = "127.0.0.1";
		final String DB_PORT = "3308";
		final String DB_NAME = "sample_java";
		final String DB_URL = "jdbc:mariadb://"	+ DB_HOST + ":" + DB_PORT + "/" + DB_NAME;
		final String DB_USER = "root";
		final String DB_PASS = "1475";
		
		// ��� ����
		try {
			Class.forName(driver);	// JDBC ����̹� ���
			conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);	// ��� ����
			if (conn != null) {	// null�� �ƴϸ� DB���� ����
				System.out.println("DB ���� ����");
			}
		} catch (ClassNotFoundException e) {
			System.out.println("����̹� �ε� ����");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("DB ���� ����");
			e.printStackTrace();
		}
	}
	
	public void closdDB() {
		try {
			if (resultSet != null) {	// ���� ��� ����
				resultSet.close();
			}
			if (preparedStatement != null) {	// ���� ��� ����
				preparedStatement.close();
			}
			if(conn != null && !conn.isClosed()) {
				conn.close();
				System.out.println("DB ���� ����");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

public class My_02_ConnetDB {

	// Connection ��ü�� ������ DataBase �����ϱ�
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DB myDB = new DB();
		myDB.connectDB();
		myDB.closdDB();

	}

}
