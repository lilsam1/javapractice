package ch_06_method;

import java.util.Scanner;

public class method_exam01_method {
	
	static int max(int a, int b, int c) { //a,b,c의 최대값을 반환
		int max= a;
		if(b > max) max = b;
		if(c > max) max = c;
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 메서드는 왜 필요한가 - method_exam01.java에서 작성한 것을 메서드를 이용해서 줄여보기
		// 3명의 신장, 체중, 나이의 최대값을 구해서 표시
		
		
		Scanner stdin = new Scanner(System.in);
		
		int[] height = new int[3];	// 신장
		int[] weight = new int[3];	// 체중
		int[] age = new int[3];		// 나이
		
		for (int i = 0; i < 3; i++) {	// 입력
			System.out.print("[" + (i + 1) +"]");
			System.out.print("신장:");	height[i] = stdin.nextInt();
			System.out.print("	체중:");	weight[i] = stdin.nextInt();
			System.out.print("	나이:");	age[i] = stdin.nextInt();
		}
		
		//신장의 최대값을 구한다
		int maxHeight = max(height[0], height[1], height[2]);
		int maxWeight = max(weight[0], weight[1], weight[2]);
		int maxAge = max(age[0], age[1], age[2]);
		
		
		System.out.println("신장의 최대값은 " + maxHeight + "입니다.");
		System.out.println("체중의 최대값은 " + maxWeight + "입니다.");
		System.out.println("나이의 최대값은 " + maxAge + "입니다.");

	}

}
