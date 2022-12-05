package ch_04_control;

import java.util.Scanner;

public class while_exam08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 음수가 입력될 때까지
		 사용자가 입력한 정수의 합계를 계산하여 출력하는 프로그램을 작성
		 while문을 사용, break 사용하지 말 것
		 */
		
		int value = 0;
		int sum = 0;
		Scanner scanner = new Scanner(System.in);
		// while문의 조건이 1) 처음에 참이 되어야 하고 2)합에 영향을 미치지 않아야 함
		
		while(value >= 0) {
			sum += value;
			System.out.println("정수를 입력해주세요");
			value = scanner.nextInt();
		}
		System.out.println("정수의 합계는 " + sum + "입니다");

	}

}
