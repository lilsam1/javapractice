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
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("----------------------------------------");
			System.out.println("선택> ");
			
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
		System.out.println("프로그램 종료");
	}
		
	// 계좌생성
	private static void createAccount() {
		System.out.println("----------------------------------------");
		System.out.println("계좌생성기");
		System.out.println("----------------------------------------");
		
		System.out.println("계좌번호: ");
		String ano = scanner.next();
		
		System.out.println("계좌주: ");
		String owner = scanner.next();
		
		System.out.println("초기입금액: ");
		int balance = scanner.nextInt();
		
		Account newAccount = new Account(ano, owner, balance);
		for(int i = 0; i<accountArray.length; i++) {
			if(accountArray[i] == null) {
				accountArray[i] = newAccount;
				System.out.println("결과: 계좌가 생성되었습니다");
				break;
			}
		}
	}
	
	// 계좌목록보기
	private static void accountList() {
		System.out.println("----------------------------------------");
		System.out.println("계좌목록");
		System.out.println("----------------------------------------");
				
		for(int i = 0; i<accountArray.length; i++) {
			Account account = accountArray[i];
			if(account !=null) {
				System.out.println(account.getAno() + "\t" + account.getOwner() + "\t" + account.getBalance());
			}
			else {	// null 값이 지어된 경우 더 이상 순회 할 필요 없음
				break;
			}
		}
		System.out.println("조회 결과입니다");

	}


	// 예금하기
	private static void deposit() {
		System.out.println("----------------------------------------");
		System.out.println("예금");
		System.out.println("----------------------------------------");
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		System.out.print("예금액: ");
		int money = scanner.nextInt();
		
		// findAccount() 호출해서 사용
		Account account = findAccount(ano);
		if(account == null) {
			System.out.println("결과: 계좌가 없습니다");
			return;
		}
		account.setBalance(account.getBalance() + money);
		System.out.println("결과 : 예금이 성공되었습니다");
		
	}
	
	// 출금하기
	private static void withdraw() {
		System.out.println("----------------------------------------");
		System.out.println("출금");
		System.out.println("----------------------------------------");
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		System.out.print("출금액: ");
		int money = scanner.nextInt();
		
		// findAccount() 호출해서 사용
		Account account = findAccount(ano);
		if(account == null) {
			System.out.println("결과: 계좌가 없습니다");
			return;
		}
		if(account.getBalance() < money) {
			System.out.println("결과 : 인출하려는 금액이 더 큽니다");
			return;
		}
		account.setBalance(account.getBalance() - money);
		System.out.println("결과 : 출금이 성공되었습니다");
		
	}
	
	// Account 배열에서 ano와 동일한 Account 객체 찾기
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
			else {	// null 값이 지정된 경우 더 이상 순회 할 필요 없음
				break;
			}
		}
		return account;
	}
		

	}