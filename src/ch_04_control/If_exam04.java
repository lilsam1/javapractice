package ch_04_control;

import java.util.Scanner;

public class If_exam04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String id, password;
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디를 입력해 주세요.");
		id = sc.nextLine();
		
		if (id.equals("java")) {
			System.out.println("아이디 일치");
			System.out.println("비밀번호를 입력해주세요");
			password = sc.nextLine();
			if (password.equals("abc123")) {
				System.out.println("비밀번호 일치");
				System.out.println("로그인 성공");
			}
			else {
				System.out.println("비밀번호 불일치");
			}
		}
		else {
			System.out.println("아이디 불일치");
		}
		sc.close();

	}

}
