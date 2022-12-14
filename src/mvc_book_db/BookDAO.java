package mvc_book_db;

import java.sql.*;
import java.util.ArrayList;

import mvc_account._db.AccountDTO;

public class BookDAO {
	private Connection connection = null;
	
	BookDAO() {
		getConnection();
	}
	
	private void getConnection() {
		try {
			String url = "jdbc:mariadb://localhost:3308/sample_java_book";
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
			String sql = "SELECT COUNT(*) AS cnt FROM book WHERE code = '" + code + "'";
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
	
	public boolean insertCode(Book book) {
		Statement statement = null;
		if(isCode(book.getCode())) {
			System.out.println(book.getCode() + "에 이미 등록된 책이 존재합니다");
			return false;
		}
		
		boolean res = false;
		int upd = 0;
		try {
			String sql = String.format("INSERT INTO book VALUES (%d, '%s', '%s', %d)"
					, book.getCode(),  book.getTitle(), book.getAuthor(), book.getStock());
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
	
	public boolean updateStock(int code, int stock, boolean flag) {

		Statement statement = null;
		boolean res = false;
		int upd = 0;
		try {
			String sql;
			if(flag) {
				sql = String.format("UPDATE book SET stock = stock + %d WHERE (code = %d)", stock, code);
			}
			else {
				sql = String.format("UPDATE book SET stock = stock - %d WHERE (code = %d)", stock, code);
			}
//			System.out.println(sql);
			statement = connection.createStatement();
			upd = statement.executeUpdate(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(statement != null) {
					statement.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		res = (upd == 0) ? false : true;
		return res;
	}
	
	public Book selectOne(String title) {
		
		Statement statement = null;
		Book book = null;
		try {
			String sql = "SELECT * FROM book WHERE title = '" + title + "'";
//			String sql = "SELECT * FROM book WHERE title LIKE = '%" + title + "%'";
			System.out.println(sql);
			statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			
			if (resultSet.next()) {
				book = new Book();
				book.setCode(resultSet.getInt("code"));
				book.setTitle(resultSet.getString("title"));
				book.setAuthor(resultSet.getString("Author"));
				book.setStock(resultSet.getInt("stock"));
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
		return book;
	}
	
	public Book selectOne(int code) {
		
		Statement statement = null;
		Book book = null;
		try {
			String sql = "SELECT * FROM book WHERE code = '" + code + "'";
			System.out.println(sql);
			statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			
			if (resultSet.next()) {
				book = new Book();
				book.setCode(resultSet.getInt("code"));
				book.setTitle(resultSet.getString("Title"));
				book.setAuthor(resultSet.getString("Author"));
				book.setStock(resultSet.getInt("stock"));
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
		return book;
	}
	
	public ArrayList<Book> selectAll() {
		// 전체 정보 전달
		Statement statement = null;
		ArrayList<Book> list = new ArrayList<>();
		try {
			String sql = "SELECT * FROM book";
			System.out.println(sql);
			statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			while (resultSet.next()) {
				Book book = new Book(resultSet.getInt("code"), resultSet.getString("title"), 
						resultSet.getString("author"), resultSet.getInt("stock"));
				list.add(book);
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
