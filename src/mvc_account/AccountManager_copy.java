package mvc_account;

import java.util.ArrayList;
import java.util.Scanner;

public class AccountManager_copy {
	private ArrayList<Account> list;
	private Scanner stdin;
	
	public AccountManager_copy() {
		list = new ArrayList<Account>();
		stdin = new Scanner(System.in);
	}
	
	public void makeAccount() { // ���� ����
		Account account = new Account();
		
		System.out.print("���� ��ȣ: ");
		account.setId(stdin.nextInt());
		
		System.out.print("�̸�: ");
		account.setName(stdin.next());
		
		System.out.print("�Աݾ�: ");
		account.setBalance(stdin.nextLong());
		
		list.add(account);
		
		System.out.println("���°� �����Ǿ����ϴ�");
		System.out.println(list.toString() + "\t");
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
		for (Account account : list) {
			System.out.println(account.getId() + "\t" + account.getName() + "\t" + account.getBalance());
		}
	}
}
