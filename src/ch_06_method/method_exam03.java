package ch_06_method;

import java.util.Scanner;

public class method_exam03 {
	/*
	 return의 기능
	 1) 값을 반환 2)함수를 종료(반복문의 break와 비슷)
	 */
	
	static int max(int a, int b) { //a,b의 최대값을 반환
		// return이 여러번 나와도 된다
		System.out.println("함수 시작");
		if (a > b)
			return a;
		else
			return b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stdin = new Scanner(System.in);
		
		System.out.println("정수 a : ");
		int a = stdin.nextInt();
		System.out.println("정수 b : ");
		int b = stdin.nextInt();
		
		System.out.println("최대값은 " + max(a, b) + "입니다.");

	}

}
