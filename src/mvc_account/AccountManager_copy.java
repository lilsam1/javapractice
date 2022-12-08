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
	
	public void makeAccount() { // 계좌 개설
		Account account = new Account();
		
		System.out.print("계좌 번호: ");
		account.setId(stdin.nextInt());
		
		System.out.print("이름: ");
		account.setName(stdin.next());
		
		System.out.print("입금액: ");
		account.setBalance(stdin.nextLong());
		
		list.add(account);
		
		System.out.println("계좌가 개설되었습니다");
		System.out.println(list.toString() + "\t");
	}
	
	public void deposit() {	// 입금
		System.out.print("계좌번호: ");
		int id = stdin.nextInt();
		
		System.out.println("입금액: ");
		long money = stdin.nextLong();
		
		// 해당 계좌 찾기
		for (Account account : list) {
			if (account.getId() == id ) {	// 동일한 계좌가 있다면
				account.setBalance(money + account.getBalance());
				System.out.println("입금완료 되었습니다");
				return;
			}
		}
		System.out.println("해당 계좌번호가 존재하지 않습니다");
		
	}
	
	public void withdraw() {	// 출금
		System.out.print("계좌번호: ");
		int id = stdin.nextInt();
		
		System.out.print("출금액: ");
		long money = stdin.nextLong();
		
		// 해당 계좌 찾기
		for (Account account : list) {
			if (account.getId() == id ) {	// 동일한 계좌가 있다면
				if (account.getBalance() < money) {
					System.out.println("잔액이 부족합니다");
				}
				else {
					account.setBalance(account.getBalance() - money);
					System.out.println("출금완료 되었습니다");
				}
				return;
			}
		}
		System.out.println("해당 계좌번호가 존재하지 않습니다");
	}
	
	public void inquire() {	// 잔액 조회
		System.out.print("계좌번호: ");
		int id = stdin.nextInt();
		
		// 해당 계좌 찾기
		for (Account account : list) {
			if (account.getId() == id) {
				System.out.println(account.getId() + "\t" + account.getName() + "\t" + account.getBalance());
				return;
			}
		}
		System.out.println("해당 계좌번호가 존재하지 않습니다");
	}
	
	public void display() {	// 출력
		for (Account account : list) {
			System.out.println(account.getId() + "\t" + account.getName() + "\t" + account.getBalance());
		}
	}
}
