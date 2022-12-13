package mvc_account.copy;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class AccountManager {
	private ArrayList<Account> list;
	private Scanner stdin;
	private Connection connection = null;
	
	public AccountManager() {
		getConnection();
		list = new ArrayList<Account>();
		stdin = new Scanner(System.in);
	}
	
	// ��� ���� ����
	private void getConnection() {	// ��� ����
		try {
			String url = "jdbc:mariadb://localhost:3308/sample_java_account";
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
	
	public void disConnect() {	// ���� ����. ���� ����ÿ� ���
		try {
			if (connection != null) {
				connection.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	private boolean isAccount(int id) {	// ������ ���°� �ִ���
		int res = 0;
		
		try {
			String sql = "SELECT COUNT(*) AS cnt FROM account WHERE id = '" + id + "'";
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
	
	private boolean insertAccount(Account account) {
		// ���� ����
		// ���� �������� ������ ���� ��ȣ�� �����ϴ��� Ȯ��
		Statement statement = null;
		if(isAccount(account.getId())) {
			System.out.println(account.getId() + " ���°� �����մϴ�");
			return false;
		}
		
		boolean res = false;
		int upd = 0;
		try {
			String sql = String.format("INSERT INTO account VALUES (%d, '%s', %d)"
					, account.getId(),  account.getName(), account.getBalance());
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
	
	private ArrayList<Account> selectAll() {
		// ��ü ���� ����
		Statement statement = null;
		ArrayList<Account> list = new ArrayList<>();
		try {
			String sql = "SELECT * FROM account";
			System.out.println(sql);
			statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			while (resultSet.next()) {
				Account account = new Account(resultSet.getInt("id"), resultSet.getString("name"), 
						resultSet.getInt("balance"));
				list.add(account);
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
	
	// ��� ���� ����
	
	public void makeAccount() { // ���� ����
		Account account = new Account();
		
		System.out.print("���� ��ȣ: ");
		account.setId(stdin.nextInt());
		
		System.out.print("�̸�: ");
		account.setName(stdin.next());
		
		System.out.print("�Աݾ�: ");
		account.setBalance(stdin.nextLong());
		
//		list.add(account);
		if(insertAccount(account)) {
			System.out.println("���°� �����Ǿ����ϴ�");
//			System.out.println(list.toString() + "\t");
		}
		else {
			System.out.println("���»����� �����߽��ϴ�");
		}
	}
	
	public void deposit() {	// �Ա�
		System.out.print("���¹�ȣ: ");
		int id = stdin.nextInt();
		
		System.out.println("�Աݾ�: ");
		long money = stdin.nextLong();
		
		// �ش� ���� ã��
		for (Account account : list) {
			if (account.getId() == id ) {	// ������ ���°� �ִٸ�
				account.setBalance(money + account.getBalance());
				System.out.println("�ԱݿϷ� �Ǿ����ϴ�");
				return;
			}
		}
		System.out.println("�ش� ���¹�ȣ�� �������� �ʽ��ϴ�");
		
	}
	
	public void withdraw() {	// ���
		System.out.print("���¹�ȣ: ");
		int id = stdin.nextInt();
		
		System.out.print("��ݾ�: ");
		long money = stdin.nextLong();
		
		// �ش� ���� ã��
		for (Account account : list) {
			if (account.getId() == id ) {	// ������ ���°� �ִٸ�
				if (account.getBalance() < money) {
					System.out.println("�ܾ��� �����մϴ�");
				}
				else {
					account.setBalance(account.getBalance() - money);
					System.out.println("��ݿϷ� �Ǿ����ϴ�");
				}
				return;
			}
		}
		System.out.println("�ش� ���¹�ȣ�� �������� �ʽ��ϴ�");
	}
	
	public void inquire() {	// �ܾ� ��ȸ
		System.out.print("���¹�ȣ: ");
		int id = stdin.nextInt();
		
		// �ش� ���� ã��
		for (Account account : list) {
			if (account.getId() == id) {
				System.out.println(account.getId() + "\t" + account.getName() + "\t" + account.getBalance());
				return;
			}
		}
		System.out.println("�ش� ���¹�ȣ�� �������� �ʽ��ϴ�");
	}
	
	public void display() {	// ���
		ArrayList<Account> list = selectAll();
		for (Account account : list) {
			System.out.println(account.getId() + "\t" + account.getName() + "\t" + account.getBalance());
		}
	}
}
