package ch_04_control;

import java.util.Scanner;

public class while_exam07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 while문과 Scanner를 이용해서 키보드로 입력한 데이터로 예금, 출금, 조회, 종료 기능을 제공하는 코드를 완성
		 */
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		while (run) {
			System.out.println("------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고  | 4.종료 ");
			System.out.println("------------------------------");
			System.out.println("선택> ");
			
			// 코드 시작
			int menuNum = Integer.parseInt(scanner.nextLine());
			switch (menuNum) {
				case 1:
					System.out.println("예금액>");
					balance += Integer.parseInt(scanner.nextLine());
					break;
				case 2:
					System.out.println("출금액>");
					balance -= Integer.parseInt(scanner.nextLine());
					break;
				case 3:
					System.out.println("잔고>");
					System.out.println(balance);
					break;
				case 4:
					run = false;
					break;
			}
			// 코드 종료
		}
		System.out.println("프로그램 종료");

	}

}
