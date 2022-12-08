package mvc_account;

import java.util.ArrayList;
import java.util.Scanner;

public class AccountManager {
	private ArrayList<Account> list;
	private Scanner stdin;
	
	private final String ERROR_NOT_FIND_ID = "�Է��Ͻ� ���¹�ȣ�� �������� �ʴ� ��ȣ�Դϴ�";
	
	public AccountManager() {
		list = new ArrayList<Account>();
		stdin = new Scanner(System.in);
	}
	
	private Account findAccountTraverses(int id) {
		// �ش� ���� ã��
		for (Account account : list) {
			if (account.getId() == id ) {	// ������ ���°� �ִٸ�
				return account;
			}
		}
		return null;
	}
	private Account findAccount(int id) {	// �Ա�, ���, ��ȸ�ÿ� ���� ã��
		Account account = findAccountTraverses(id);
		if (account == null ) {	// ������ ���°� �ִٸ�
			System.out.println(ERROR_NOT_FIND_ID );
		}
		return account;
	}
	private boolean isAccount(int id) {	// ���� �ߺ� ��ȸ�̱� ������ account�� �������� ���� bool �� ����
		return (findAccountTraverses(id) == null) ? false : true;
	}
	
	public void makeAccount() { // ���� ����
		Account account = new Account();
		
		System.out.print("���� ��ȣ: ");
		account.setId(stdin.nextInt());
		
		System.out.print("�̸�: ");
		account.setName(stdin.next());
		
		System.out.print("�Աݾ�: ");
		account.setBalance(stdin.nextLong());
		
//		if (!isAccount(id)) {
//			list.add(account);
//			
//			System.out.println("���°� �����Ǿ����ϴ�");
//			System.out.println(list.toString() + "\t");
//		}
	}
	
	public void deposit() {	// �Ա�
		System.out.print("���¹�ȣ: ");
		int id = stdin.nextInt();
		
		System.out.println("�Աݾ�: ");
		long money = stdin.nextLong();
		
		// �ش� ���� ã��
		Account account = findAccount(id);
		if (account != null) {
			
		}
		
		
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
	}
	
	public void display() {	// ���
		for (Account account : list) {
			System.out.println(account.getId() + "\t" + account.getName() + "\t" + account.getBalance());
		}
	}
}
