package recur;

import java.util.Scanner;

public class Recur {
	// 순수 재귀 메서드
	static void recur(int n) {
		if (n > 0) {
			recur(n - 1);
			System.out.println(n);
			recur(n - 2);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요: ");
		int x = stdin.nextInt();
		
		recur(x);

	}

}
