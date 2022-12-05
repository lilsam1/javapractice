package ch_03_operator;

import java.util.Scanner;

public class Ex_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 사용자로부터 두 개의 정수를 입력받아서
		 * 정수의 합, 정수의 차, 정수의 곱, 정수의 평균, 큰 수, 작은 수를 계산하여 화면에 출력하는 프로그램 작성
		 * 큰 수와 작은 수를 구할 때는 조건연산자(삼항연산자)를 사용하시오
		 */
		
		Scanner sc = new Scanner(System.in);
		int x, y;
		
		System.out.print("x를 입력하시오: "); //print:줄을 바꾸지 않는다
		x = sc.nextInt(); // 정수 입력
		
		System.out.print("y를 입력하시오: ");
		y = sc.nextInt();
	
//		double avg = (double)(x + y) / 2;
		
		System.out.println("두 수의 합 : " + (x + y)); //합을 출력
		System.out.println("두 수의 차 : " + (x - y)); //차이를 출력
		System.out.println("두 수의 곱 : " + (x * y)); //곱을 출력
//		System.out.println("두 수의 평균 : " + avg);	//평균을 출력
		System.out.println("두 수의 평균 : " + ((double)(x + y)/2));
		System.out.println("큰 수 : " + (x > y ? x : y)); //큰 수 출력
		System.out.println("작은 수 : " + (x < y ? x : y)); //작은 수 출력

	}

}
