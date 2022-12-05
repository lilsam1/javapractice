package ch_04_control;

import java.util.Scanner;

public class If_exam06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//세 정수의 최대값 구하기
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 a : ");
		int a = sc.nextInt();
		System.out.println("정수 b : ");
		int b = sc.nextInt();
		System.out.println("정수 c : ");
		int c = sc.nextInt();
		
		int max = a;
		if (b > max) {
			max = b;
		}
		if (c > max) {
			max = c;
		}
		
		System.out.println("최대값 : " + max);
		
		
//		// 응용) 세 정수의 최소값 구하기

//		int min = a;
//		if (b < min) {
//			min = b;
//		}
//		if (c < min) {
//			min = c;
//		}
//		
//		System.out.println("최소값 : " + min);

	}

}
