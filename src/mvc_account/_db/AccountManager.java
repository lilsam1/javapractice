package mvc_account._db;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class AccountManager {
	private ArrayList<AccountDTO> list;
	private Scanner stdin;
	private AccountDAO accountDAO;
	
	public AccountManager() {
		accountDAO = new AccountDAO();
		list = new ArrayList<AccountDTO>();
		stdin = new Scanner(System.in);
	}
	
	public void disConnect() {
		accountDAO.disConnect();
	}
	
	public void makeAccount() { // ���� ����
		AccountDTO account = new AccountDTO();
		
		System.out.print("���� ��ȣ: ");
		account.setId(stdin.nextInt());
		
		System.out.print("�̸�: ");
		account.setName(stdin.next());
		
		System.out.print("�Աݾ�: ");
		account.setBalance(stdin.nextLong());
		
//		list.add(account);
		if(accountDAO.insertAccount(account)) {
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
		if (accountDAO.isAccount(id)) {
			accountDAO.updateBalance(id, money, true);
		}
		else {
			System.out.println("�ش� ���¹�ȣ�� �������� �ʽ��ϴ�");
		}
	}
	
	public void withdraw() {	// ���
		System.out.print("���¹�ȣ: ");
		int id = stdin.nextInt();
		
		System.out.print("��ݾ�: ");
		long money = stdin.nextLong();
		
		// �ش� ���� ã��
		if (accountDAO.isAccount(id)) {
			AccountDTO account = accountDAO.selectOne(id);
			if (account.getBalance() < money) {
				System.out.println("�ܾ��� �����մϴ�");
			}
			else {
				accountDAO.updateBalance(id, money, false);
				System.out.println("��ݿϷ� �Ǿ����ϴ�");
			}
			return;
		}
		else {
			System.out.println("�ش� ���¹�ȣ�� �������� �ʽ��ϴ�");
		}
	}
	
	public void inquire() {	// �ܾ� ��ȸ
		System.out.print("���¹�ȣ: ");
		int id = stdin.nextInt();
		
		// �ش� ���� ã��
		AccountDTO account = accountDAO.selectOne(id);
		if (account != null) {
			System.out.println(account.getId() + "\t" + account.getName() + "\t" + account.getBalance());
		}
		else {
			System.out.println("�ش� ���¹�ȣ�� �������� �ʽ��ϴ�");
		}
	}
	
	public void display() {	// ���
		ArrayList<AccountDTO> list = accountDAO.selectAll();
		for (AccountDTO account : list) {
			System.out.println(account.getId() + "\t" + account.getName() + "\t" + account.getBalance());
		}
	}
}
