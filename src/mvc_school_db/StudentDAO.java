package mvc_school_db;

import java.sql.*;
import java.util.ArrayList;

import mvc_account._db.AccountDTO;

public class StudentDAO {
	private Connection connection = null;
	
	StudentDAO() {
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
	
	public boolean isStudentNumber(int studentNumber) {
		int res = 0;
		
		try {
			String sql = "SELECT COUNT(*) AS cnt FROM student WHERE studentNumber = '" + studentNumber + "'";
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
	
	public boolean insertStudentNumber(Student student) {
		Statement statement = null;
		if(isStudentNumber(student.getStudentNumber())) {
			System.out.println(student.getStudentNumber() + "은 이미 존재하는 학번입니다");
			return false;
		}
		
		boolean res = false;
		int upd = 0;
		try {
			String sql = String.format("INSERT INTO student VALUES ('%s', '%s', '%s', %d)"
					, student.getName(),  student.getPhoneNumber(), student.getMemo(), 
					student.getStudentNumber());
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
	
	public boolean deleteStudentNumber(Student student) {
		Statement statement = null;
		if(!isStudentNumber(student.getStudentNumber())) {
			System.out.println(student.getStudentNumber() + "학번이 존재하지 않습니다");
			return false;
		}
		
		boolean res = false;
		int upd = 0;
		try {
			String sql = String.format("DELETE FROM student WHERE studentNumber = '%d'", student.getStudentNumber());
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
	
		
	public Student selectOne(int studentNumber) {
		
		Statement statement = null;
		Student student = null;
		try {
			String sql = "SELECT * FROM student WHERE studentNumber = '" + studentNumber + "'";
//			System.out.println(sql);
			statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			
			if (resultSet.next()) {
				student = new Student();
				student.setName(resultSet.getString("name"));
				student.setPhoneNumber(resultSet.getString("phoneNumber"));
				student.setMemo(resultSet.getString("memo"));
				student.setStudentNumber(resultSet.getInt("studentNumber"));
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
		return student;
	}
	
	public ArrayList<Student> selectAll() {
		// 전체 정보 전달
		Statement statement = null;
		ArrayList<Student> list = new ArrayList<>();
		try {
			String sql = "SELECT * FROM student";
//			System.out.println(sql);
			statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			while (resultSet.next()) {
				Student student = new Student(resultSet.getString("name"), resultSet.getString("phoneNumber"), 
						resultSet.getString("memo"), resultSet.getInt("studentNumber"));
				list.add(student);
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
