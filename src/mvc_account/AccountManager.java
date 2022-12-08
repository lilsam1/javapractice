package mvc_account;

import java.util.ArrayList;
import java.util.Scanner;

public class AccountManager {
	private ArrayList<Account> list;
	private Scanner stdin;
	
	private final String ERROR_NOT_FIND_ID = "입력하신 계좌번호는 존재하지 않는 번호입니다";
	
	public AccountManager() {
		list = new ArrayList<Account>();
		stdin = new Scanner(System.in);
	}
	
	private Account findAccountTraverses(int id) {
		// 해당 계좌 찾기
		for (Account account : list) {
			if (account.getId() == id ) {	// 동일한 계좌가 있다면
				return account;
			}
		}
		return null;
	}
	private Account findAccount(int id) {	// 입금, 출금, 조회시에 계좌 찾기
		Account account = findAccountTraverses(id);
		if (account == null ) {	// 동일한 계좌가 있다면
			System.out.println(ERROR_NOT_FIND_ID );
		}
		return account;
	}
	private boolean isAccount(int id) {	// 계좌 중복 조회이기 때문에 account을 리턴하지 말고 bool 값 리턴
		return (findAccountTraverses(id) == null) ? false : true;
	}
	
	public void makeAccount() { // 계좌 개설
		Account account = new Account();
		
		System.out.print("계좌 번호: ");
		account.setId(stdin.nextInt());
		
		System.out.print("이름: ");
		account.setName(stdin.next());
		
		System.out.print("입금액: ");
		account.setBalance(stdin.nextLong());
		
//		if (!isAccount(id)) {
//			list.add(account);
//			
//			System.out.println("계좌가 개설되었습니다");
//			System.out.println(list.toString() + "\t");
//		}
	}
	
	public void deposit() {	// 입금
		System.out.print("계좌번호: ");
		int id = stdin.nextInt();
		
		System.out.println("입금액: ");
		long money = stdin.nextLong();
		
		// 해당 계좌 찾기
		Account account = findAccount(id);
		if (account != null) {
			
		}
		
		
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
	}
	
	public void display() {	// 출력
		for (Account account : list) {
			System.out.println(account.getId() + "\t" + account.getName() + "\t" + account.getBalance());
		}
	}
}
