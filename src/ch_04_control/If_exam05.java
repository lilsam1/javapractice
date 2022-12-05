package ch_04_control;

import java.util.Scanner;

public class If_exam05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stdin = new Scanner(System.in);
		System.out.println("계절을 표시합니다. \n 몇 월입니까? :");
		int month = stdin.nextInt();
		
		if (month >= 3 && month <=5 ) {
			System.out.println("봄입니다");
		}
		else if (month >= 6 && month <= 8) {
			System.out.println("여름입니다");
		}
		else if (month >= 9 && month <= 11) {
			System.out.println("가을입니다");
		}
		else if (month == 12 || month == 1 || month == 2) {
			System.out.println("겨울입니다");
		}
		else {
			System.out.println("잘못된 입력 값입니다");
		}

	}

}
