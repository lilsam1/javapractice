package ch_06_method;

import java.util.Scanner;

public class method_exam08 {
	// return 값이 없는 메서드
	// 좌하변이 직각인 직각삼각형을 표시
	static void putStars(int n) { // void 메서드 -> return 값이 없는 메서드
		// 문자 '*'을 n개 연속 표시
		while (n-- > 0)
			System.out.print('*');
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
		
		System.out.println("좌하변이 직각인 직각삼각형을 표시합니다");
		System.out.print("몇 단 :");
		int n = stdin.nextInt();
		
		for (int i = 1; i <= n; i++) {
			putStars(i);
			System.out.println();
		}

	}

}
