package ch_16_JDBC;

import java.sql.SQLException;
import java.util.Scanner;

class User { // ȸ�� ������ ����. �� Ŭ����
	public String userID;
	public String name;
	public int age;
	public String job;
}

// �μ�Ʈ
class DBInsert extends DB {
	private User setUser() {
		// �ַܼ� �Է� ����
		User user = new User();
		Scanner scanner = new Scanner(System.in);
		
		boolean validate = false;
		String validateTemp;
		do {
			System.out.println("�ű� ȸ���� ���̵� �Է��ϼ���(��� ����, ���� �����Ϳ��� ����� ���� �ȵ�): ");
			user.userID = scanner.next();
			System.out.println("�ű� ȸ���� �̸��� �Է��ϼ���");
			user.name = scanner.next();
			System.out.println("�ű� ȸ���� ������ �Է��ϼ���(���ڸ�): ");
			user.age = Integer.parseInt(scanner.next());
			System.out.println("�ű� ȸ���� ������ �Է��ϼ���");
			user.job = scanner.next();
			
			System.out.println("�ű� ȸ�� : " + user.userID + " / " + user.name + " / " + 
					user.age + " / " + user.job + "�� �½��ϱ�? (y/n)");
			validateTemp = scanner.next();	// �Է°� ����
			validate = !validateTemp.equals("y");	// �Է°��� y�� �ƴ� ��� true, ���� ��� false ��ȯ
//			System.out.println(validate);
		} while (validate);
		
		scanner.close();
		return user;
	}
	
	public void insertUser() throws SQLException {
		// setUser() ȣ�� �� ������ �޾� DB�� �Է�
		User user = setUser();
		// �Ű� ����ȭ�� SQL �� �ۼ�
		String insertsql = " INSERT INTO tUSER (userID, name, age, job) VALUES (?, ?, ?, ?) ";
		
		// preparedStatement ��� �� �� ����
		preparedStatement = conn.prepareStatement(insertsql);	// ���� ���� �غ�
		// ?�� �� ���� �������ִµ�, ?�� ������ ���� 1������ ��ȣ�� �ο�
		preparedStatement.setString(1, user.userID);
		preparedStatement.setString(2, user.name);
		preparedStatement.setInt(3, user.age);
		preparedStatement.setString(4, user.job);
		
		// SQL �� ����
		int rows = preparedStatement.executeUpdate();	//executeUpdate()�� ȣ���ϸ� sql�� ����. ������ ���� ������ ���� ��ȯ
		// pstmt.excuteQuery() : select�� ����
		// pstmt.excuteUpdate() : insert, update, delete ����
		
		// insert�� ��� ���������� ������ �Ǿ����� 1�� ����
		if (rows == 1) {
			System.out.println("������ �Է¿� �����߽��ϴ�");
		}
		else {
			System.out.println("������ �Է¿� �����߽��ϴ�");
		}
	}
	
}

public class My_04_InsertUser {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		DBInsert myDB = new DBInsert();
		myDB.connectDB();
		myDB.insertUser();
		myDB.closdDB();

	}

}
