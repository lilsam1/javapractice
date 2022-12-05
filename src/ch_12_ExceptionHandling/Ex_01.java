package ch_12_ExceptionHandling;

import java.util.Scanner;

// 로그인 정보가 틀릴 경우를 사용자 정의 예외를 만들어서 예외처리 할 것
class LException extends Exception {
	public LException(String message) {
		super(message);
	}
	
	/* 예외 발생 시 로그로 남기는 코드 - 해킹 시도 시 확인이 용이 ex)동일한 IP로 계속 로그인을 시도하는 경우 */
	public LException(String message, String memberID, String password) {
		super(message);
		updateLog(memberID, password);
	}
	public void updateLog(String memberID, String password) {
		
	}
} 

public class Ex_01 {
	String memberID = "abc";
	String password = "1234";
	Scanner stdin = new Scanner(System.in);
	
	private boolean confirmLogin(String memberID, String password) throws LException {
		if (this.memberID.equals(memberID) && this.password.equals(password)) {
			System.out.println("로그인 되었습니다");
			return true;
		}
		else {
			throw new LException("로그인 정보가 정확하지 않습니다");
//			return false;
		}
	}
	
	public void login() {
		String memberID, password;
		boolean answer;
		System.out.println("로그인 정보를 입력해주세요");
	
		do {
			System.out.print("아이디를 입력해주세요 >>>");
			memberID = stdin.nextLine();
			System.out.print("비밀번호를 입력해주세요 >>>");
			password = stdin.nextLine();
			try {
				answer = confirmLogin(memberID, password);
			} catch(LException e) {
				System.out.println(e.getMessage());
				answer = false;
			}
		}
		while (!answer);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex_01 ex = new Ex_01();
		ex.login();

	}

}
