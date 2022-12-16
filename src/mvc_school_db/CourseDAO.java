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
	
	public boolean isCourse(Course course) {
		PreparedStatement preparedStatement = null;
		int cnt = 0;
		try {
			String sql = "SELECT COUNT(*) AS cnt FROM course WHERE (studentNumber = ?) AND (code = ?) ";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, course.getStudentNumber());
			preparedStatement.setInt(2, course.getCode());
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				cnt = resultSet.getInt("cnt");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(preparedStatement != null) {
					preparedStatement.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return cnt != 0;
	}
	
	public boolean insertCourse(Course course) {
		PreparedStatement preparedStatement = null;
		int cnt = 0;
		try {
			String sql = "INSERT INTO course VALUES (null, ?, ?, 0)";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, course.getStudentNumber());
			preparedStatement.setInt(2, course.getCode());
			cnt = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(preparedStatement != null) {
					preparedStatement.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return cnt != 0;
	}
	
	public boolean deleteCourse(Course course) {
		PreparedStatement preparedStatement = null;
		int cnt = 0;
		try {
			String sql = "DELETE FROM course WHERE (studentNumber = ?) AND (code = ?) ";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, course.getStudentNumber());
			preparedStatement.setInt(2, course.getCode());
			cnt = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(preparedStatement != null) {
					preparedStatement.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return cnt != 0;
	}
	
	public boolean updateScore(Course course) {
		PreparedStatement preparedStatement = null;
		int cnt = 0;
		try {
			String sql = "UPDATE course SET score = ? WHERE (studentNumber = ?) AND (code = ?) ";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, course.getScore());
			preparedStatement.setInt(2, course.getStudentNumber());
			preparedStatement.setInt(3, course.getCode());
			cnt = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(preparedStatement != null) {
					preparedStatement.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return cnt != 0;
	}
	
	public ArrayList<Course> selectAllByStudentNumber(int studentNumber) {
		PreparedStatement preparedStatement = null;
		ArrayList<Course> courses = new ArrayList<>();
		int cnt = 0;
		try {
			String sql = "SELECT * FROM course WHERE (studentNumber = ?) ";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, studentNumber);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				Course course = new Course();
				course.setNum(resultSet.getInt("num"));
				course.setStudentNumber(resultSet.getInt("studentNumber"));
				course.setCode(resultSet.getInt("code"));
				course.setScore(resultSet.getInt("score"));
				courses.add(course);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(preparedStatement != null) {
					preparedStatement.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return courses;
	}
	
}
