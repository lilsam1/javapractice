package ch_06_method;

import java.util.Scanner;

public class Ex_05Q {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 login() 메서드와 logout() 메서드를 선언하려고 합니다
		 login() 메서드를 호출할 때는 매개값으로 id와 password를 제공하고
		 lgout() 메서드는 id만 매개값으로 제공합니다
		 
		 1) login() 메서드는 매개값 id가 "admin", 매개값 password가 "1234"일 경우에만 true로 리턴하고
		 그 외의 값일 경우에는 false를 리턴하도록 하세요
		 2) logout() 메서드는 "로그아웃 되었습니다"가 출력되도록 하세요
		 */
		
		Scanner scanner = new Scanner(System.in);
		String id, password;
		System.out.print("아이디를 입력해주세요. >> ");
		id = scanner.nextLine();
		System.out.println("비밀번호를 입력해주세요. >> ");
		password = scanner.nextLine();
		
//		boolean result = Login(id, password);
//		 if (result) {
//			 System.out.println("로그인 되었습니다");
//			 Logout(id);
//		 }
//		 else {
//			 System.out.println("id 또는 password가 올바르지 않습니다");
//		 }

	}
	
	// login() 메서드 작성위치
	// logout() 메서드 작성위치

}
