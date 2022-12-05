package ch_07_ex_account;

import java.util.Scanner;


public class Account_ex01 {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	private static char[] newAccount;
	private static String ano;
	private static String owner;
	private static int balance;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		while(run) {
			System.out.println("----------------------------------------");
			System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.����");
			System.out.println("----------------------------------------");
			System.out.println("����> ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				createAccount();
			} else if(selectNo == 2) {
				accountList();
			} else if(selectNo == 3) {
				deposit();
			} else if(selectNo == 4) {
				withdraw();
			} else if(selectNo == 5) {
				run = false;
			}	
		}
		System.out.println("���α׷� ����");
	}
		
	// ���»���
	private static void createAccount() {
		System.out.println("----------------------------------------");
		System.out.println("���»�����");
		System.out.println("----------------------------------------");
		
		System.out.println("���¹�ȣ: ");
		String ano = scanner.next();
		
		System.out.println("������: ");
		String owner = scanner.next();
		
		System.out.println("�ʱ��Աݾ�: ");
		int balance = scanner.nextInt();
		
		Account newAccount = new Account(ano, owner, balance);
		for(int i = 0; i<accountArray.length; i++) {
			if(accountArray[i] == null) {
				accountArray[i] = newAccount;
				System.out.println("���: ���°� �����Ǿ����ϴ�");
				break;
			}
		}
	}
	
	// ���¸�Ϻ���
	private static void accountList() {
		System.out.println("----------------------------------------");
		System.out.println("���¸��");
		System.out.println("----------------------------------------");
				
		for(int i = 0; i<accountArray.length; i++) {
			Account account = accountArray[i];
			if(account !=null) {
				System.out.println(account.getAno() + "\t" + account.getOwner() + "\t" + account.getBalance());
			}
			else {	// null ���� ����� ��� �� �̻� ��ȸ �� �ʿ� ����
				break;
			}
		}
		System.out.println("��ȸ ����Դϴ�");

	}


	// �����ϱ�
	private static void deposit() {
		System.out.println("----------------------------------------");
		System.out.println("����");
		System.out.println("----------------------------------------");
		System.out.print("���¹�ȣ: ");
		String ano = scanner.next();
		System.out.print("���ݾ�: ");
		int money = scanner.nextInt();
		
		// findAccount() ȣ���ؼ� ���
		Account account = findAccount(ano);
		if(account == null) {
			System.out.println("���: ���°� �����ϴ�");
			return;
		}
		account.setBalance(account.getBalance() + money);
		System.out.println("��� : ������ �����Ǿ����ϴ�");
		
	}
	
	// ����ϱ�
	private static void withdraw() {
		System.out.println("----------------------------------------");
		System.out.println("���");
		System.out.println("----------------------------------------");
		System.out.print("���¹�ȣ: ");
		String ano = scanner.next();
		System.out.print("��ݾ�: ");
		int money = scanner.nextInt();
		
		// findAccount() ȣ���ؼ� ���
		Account account = findAccount(ano);
		if(account == null) {
			System.out.println("���: ���°� �����ϴ�");
			return;
		}
		if(account.getBalance() < money) {
			System.out.println("��� : �����Ϸ��� �ݾ��� �� Ů�ϴ�");
			return;
		}
		account.setBalance(account.getBalance() - money);
		System.out.println("��� : ����� �����Ǿ����ϴ�");
		
	}
	
	// Account �迭���� ano�� ������ Account ��ü ã��
	private static Account findAccount(String ano) {
		Account account = null;
		for(int i = 0; i<accountArray.length; i++) {
			if(accountArray[i] != null) {
				String dbAno = accountArray[i].getAno();
				if(dbAno.equals(ano)) {
					account = accountArray[i];
					break;
				}
			}
			else {	// null ���� ������ ��� �� �̻� ��ȸ �� �ʿ� ����
				break;
			}
		}
		return account;
	}
		

	}