package mvc_school_db;

import java.sql.*;
import java.util.ArrayList;

import mvc_account._db.AccountDTO;

public class SubjectDAO {
	private Connection connection = null;
	
	SubjectDAO() {
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
	
	public boolean isCode(int code) {
		int res = 0;
		
		try {
			String sql = "SELECT COUNT(*) AS cnt FROM subject WHERE code = '" + code + "'";
//			System.out.println(sql);
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			resultSet.next();
			res = resultSet.getInt("cnt");
//			System.out.println(rest);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return res != 0 ? true : false;
	}
	
	public boolean insertCode(Subject subject) {
		Statement statement = null;
		if(isCode(subject.getCode())) {
			System.out.println(subject.getCode() + "은 이미 존재하는 과목입니다");
			return false;
		}
		
		boolean res = false;
		int upd = 0;
		try {
			String sql = String.format("INSERT INTO subject VALUES (%d, '%s')"
					, subject.getCode(), subject.getSubjectName());
//			System.out.println(sql);
			statement = connection.createStatement();
			upd = statement.executeUpdate(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if (statement != null) {
					statement.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		res = (upd == 0) ? false : true;
		return res;
	}
	
	public boolean deleteCode(Subject subject) {
		Statement statement = null;
		if(!isCode(subject.getCode())) {
			System.out.println(subject.getCode() + "은 존재하지 않는 과목입니다");
			return false;
		}
		
		boolean res = false;
		int upd = 0;
		try {
			String sql = String.format("DELETE FROM subject WHERE code = '%d'", subject.getCode());
//			System.out.println(sql);
			statement = connection.createStatement();
			upd = statement.executeUpdate(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if (statement != null) {
					statement.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		res = (upd == 0) ? false : true;
		return res;
	}
	
		
	public Subject selectOne(int code) {
		
		Statement statement = null;
		Subject subject = null;
		try {
			String sql = "SELECT * FROM subject WHERE code = '" + code + "'";
//			System.out.println(sql);
			statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			
			if (resultSet.next()) {
				subject = new Subject();
				subject.setCode(resultSet.getInt("code"));
				subject.setSubjectName(resultSet.getString("subjectName"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (statement != null) {
					statement.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return subject;
	}
	
	public ArrayList<Subject> selectAll() {
		// 전체 정보 전달
		Statement statement = null;
		ArrayList<Subject> list = new ArrayList<>();
		try {
			String sql = "SELECT * FROM subject";
//			System.out.println(sql);
			statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			while (resultSet.next()) {
				Subject subject = new Subject(resultSet.getInt("code"), resultSet.getString("subjectName"));
				list.add(subject);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(statement != null) {
					statement.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}
}
