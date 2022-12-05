package ch_06_method;

import java.util.Scanner;

public class method_exam02 {
	
	static int max(int a, int b, int c) {	//a,b,c의 최대값을 반환하는 메서드 // int는 리턴할 자료형이 int임을 의미 //int a, b, c는 매개변수
		int max= a;
		if(b > max) max = b;
		if(c > max) max = c;
		return max;		// 반환값
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// method_exam01_method에서 작성한 method를 가져와서 재사용하기
		
		Scanner stdin = new Scanner(System.in);
		
		System.out.print("정수 a : ");
		int a = stdin.nextInt();
		System.out.print("정수 b : ");
		int b = stdin.nextInt();
		System.out.print("정수 c : ");
		int c = stdin.nextInt();
		
		System.out.println("최대값은 " + max(a,b,c) + "입니다");

	}

}
