package ch_12_ExceptionHandling;

import java.util.Scanner;

// �α��� ������ Ʋ�� ��츦 ����� ���� ���ܸ� ���� ����ó�� �� ��
class LException extends Exception {
	public LException(String message) {
		super(message);
	}
	
	/* ���� �߻� �� �α׷� ����� �ڵ� - ��ŷ �õ� �� Ȯ���� ���� ex)������ IP�� ��� �α����� �õ��ϴ� ��� */
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
			System.out.println("�α��� �Ǿ����ϴ�");
			return true;
		}
		else {
			throw new LException("�α��� ������ ��Ȯ���� �ʽ��ϴ�");
//			return false;
		}
	}
	
	public void login() {
		String memberID, password;
		boolean answer;
		System.out.println("�α��� ������ �Է����ּ���");
	
		do {
			System.out.print("���̵� �Է����ּ��� >>>");
			memberID = stdin.nextLine();
			System.out.print("��й�ȣ�� �Է����ּ��� >>>");
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
