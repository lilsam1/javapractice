package ch_04_control;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* do while 문을 사용해서 사용자로부터 월의 번호를 입력받는 프로그램을 작성해보세요
		 * 사용자가 올바른 월 번호를 입력할 때까지 반복을 계속합니다
		 * 사용자가 올바른 월 번호를 입력해야만 다음 문장으로 넘어갑니다
		 */
		Scanner scanner = new Scanner(System.in);
		int month;
		
		do {
			System.out.print("올바른 월을 입력하세요 [1-12]");
			month = scanner.nextInt();
		} while (month < 1 || month > 12);
		System.out.println("사용자가 입력한 월은 " + month + "입니다");
		
	}

}
