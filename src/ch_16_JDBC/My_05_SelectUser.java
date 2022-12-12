package ch_16_JDBC;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

class DBSelect extends DB {
	Scanner scanner = new Scanner(System.in);
	
	//�߰��� �ڵ�
	protected ResultSet querySelect(String sql) {
		// select ���� �� ��� ����
		try {
			preparedStatement = conn.prepareStatement(sql);	// ���� ���� �غ�
			
			// SQL���� INSERT, UPDATE, DELTE ���� ���״� executeUpadt() �޼��带 ȣ��������
			// �����͸� �������� SELCT ���� ���״� executeQuery() �޼��带 ȣ��
			resultSet = preparedStatement.executeQuery();
		} catch(SQLException e) {
			System.out.println("error: " + e);
		}
		// resultSet�� SELECT ���� ����� Į������ ������ ��row�� ����
		return resultSet;
	}
	
	private void printUser(String sql) throws SQLException {
		// select ���� ����� �޾� �ݼֿ� ���
		// ��ü ��� ������ �� ���� ����ϴ� ���
		int totalRow;
		int num = 1;
		ResultSet resultSet = querySelect(sql);
		
		// ResultSet�� ������ ���ؼ� 1�� ���� 1�� �ƴ� ��츦 �ҷ�
		// ResultSet�� ������ ���ϴ� �޼���� ��� �ٸ� �������� ������ ����
		resultSet.last();	// ������ row�� �̵�
		totalRow = resultSet.getRow();	// row count�� ����
		resultSet.beforeFirst();	// ó�� row�� Ŀ���� �̵� (�ʱ� ���·� ��������)
		if (totalRow == 1) {
			// �����Ͱ� �ϳ�
			if (resultSet.next()) {
				System.out.println("���̵� : " + resultSet.getString(1));
				System.out.println("�̸� : " + resultSet.getString(2));
				System.out.println("���� : " + resultSet.getString(3));
				System.out.println("���� : " + resultSet.getString(4));
				System.out.println();
			}
			else {
				System.out.println("�Է��Ͻ� ���̵��� �����ʹ� �������� �ʽ��ϴ�");
			}
		}
		else {
			// ��ü ��� ���
			// �������� ó������ �о���Ƿ� next�� ������ �� ���� �о����, ���� �ٷ� Ŀ���� �̵�
			// ���� ���� �������� �����͸� �������� �����Ͱ� ������ ���� ����
			while (resultSet.next()) {
				System.out.println(num + "���� ȸ��");
				System.out.println("���̵� : " + resultSet.getString(1));
				System.out.println("�̸� : " + resultSet.getString(2));
				System.out.println("���� : " + resultSet.getString(3));
				System.out.println("���� : " + resultSet.getString(4));
				System.out.println();
				num++;
			}
		}
	}
	
	public void getAllUser() throws SQLException {
		// ��ü���
		String sql;
		System.out.println("��ü ȸ�� ����Դϴ�");
		sql = "SELECT * FROM tUser ";
		printUser(sql);
		System.out.println("==============");
	}
	
	public void getOneUser() throws SQLException {
		// �������
		String sql;
		String userID;
		String validateTemp;
		boolean validate = false;
		
		do {
			System.out.println("���� �˻� �� ȸ���� ���̵� �Է��ϼ���");
			userID = scanner.next();
			
			System.out.println("�˻��� ȸ���� ���̵� " + userID + "�� �½����ϱ�? (y/n) ");
			validateTemp = scanner.next();
			
			// �Է� ���� y�� �ƴ� ��� true, ���� ��� false ��ȯ
			validate = !validateTemp.equals("y");
		} while(validate);
		sql = "SELECT * FROM tUser WHERE userID = '" + userID + "'";
		printUser(sql);
	}
}

public class My_05_SelectUser {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		DBSelect myDB = new DBSelect();
		myDB.connectDB();
		myDB.getAllUser();
		myDB.getOneUser();
		myDB.closdDB();

	}

}
