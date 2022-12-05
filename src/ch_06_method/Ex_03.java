package ch_06_method;

import java.util.Scanner;

public class Ex_03 {
	/*
	 우하변이 직각인 직각삼각형을 표시하세요
	 별이 출력되는 부분은 putStars() 메서드를 정의해서 구현하세요
	 
	 몇 단 : 4
	    *
	   **
	  ***
	 ****
	 
	 */
	static void putStars(int n, int total) {
		for (int i = 1; i <= total; i++) {
				if (i <= total - n) {
					System.out.print(' ');
				} else {
					System.out.print('*');
				}
			}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
		
		System.out.println("우하변이 직각인 직각삼각형을 표시합니다.");
		System.out.print("몇 단 : ");
		int total = stdin.nextInt();
		
		for(int i = 1; i <= total; i++) {
			putStars(i, total); //putStars() 메서드 호출
			System.out.println();
		}

	}

}
