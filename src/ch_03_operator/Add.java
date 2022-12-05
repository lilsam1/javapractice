package ch_03_operator;

import java.util.Scanner;

public class Add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 콘솔에서 입력을 받을 때는 Scanner 클래스 사용
		 */
		Scanner sc = new Scanner(System.in);
		int x, y, sum;
		
		System.out.print("첫 번째 숫자를 입력하시오: "); //print:줄을 바꾸지 않는다
		x = sc.nextInt(); // 정수 입력
		
		System.out.print("두 번째 숫자를 입력하시오: ");
		
		y = sc.nextInt();
		
		sum = x + y;
		System.out.println(sum); //합을 출력

	}

}
