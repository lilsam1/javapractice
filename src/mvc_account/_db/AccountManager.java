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
	
	public void makeAccount() { // 계좌 개설
		AccountDTO account = new AccountDTO();
		
		System.out.print("계좌 번호: ");
		account.setId(stdin.nextInt());
		
		System.out.print("이름: ");
		account.setName(stdin.next());
		
		System.out.print("입금액: ");
		account.setBalance(stdin.nextLong());
		
//		list.add(account);
		if(accountDAO.insertAccount(account)) {
			System.out.println("계좌가 개설되었습니다");
//			System.out.println(list.toString() + "\t");
		}
		else {
			System.out.println("게좌생성에 실패했습니다");
		}
	}
	
	public void deposit() {	// 입금
		System.out.print("계좌번호: ");
		int id = stdin.nextInt();
		
		System.out.println("입금액: ");
		long money = stdin.nextLong();
		
		// 해당 계좌 찾기
		if (accountDAO.isAccount(id)) {
			accountDAO.updateBalance(id, money, true);
		}
		else {
			System.out.println("해당 계좌번호가 존재하지 않습니다");
		}
	}
	
	public void withdraw() {	// 출금
		System.out.print("계좌번호: ");
		int id = stdin.nextInt();
		
		System.out.print("출금액: ");
		long money = stdin.nextLong();
		
		// 해당 계좌 찾기
		if (accountDAO.isAccount(id)) {
			AccountDTO account = accountDAO.selectOne(id);
			if (account.getBalance() < money) {
				System.out.println("잔액이 부족합니다");
			}
			else {
				accountDAO.updateBalance(id, money, false);
				System.out.println("출금완료 되었습니다");
			}
			return;
		}
		else {
			System.out.println("해당 계좌번호가 존재하지 않습니다");
		}
	}
	
	public void inquire() {	// 잔액 조회
		System.out.print("계좌번호: ");
		int id = stdin.nextInt();
		
		// 해당 계좌 찾기
		AccountDTO account = accountDAO.selectOne(id);
		if (account != null) {
			System.out.println(account.getId() + "\t" + account.getName() + "\t" + account.getBalance());
		}
		else {
			System.out.println("해당 계좌번호가 존재하지 않습니다");
		}
	}
	
	public void display() {	// 출력
		ArrayList<AccountDTO> list = accountDAO.selectAll();
		for (AccountDTO account : list) {
			System.out.println(account.getId() + "\t" + account.getName() + "\t" + account.getBalance());
		}
	}
}
