package recur;

import java.util.Scanner;

public class Recur {
	// ���� ��� �޼���
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
		
		System.out.println("������ �Է��ϼ���: ");
		int x = stdin.nextInt();
		
		recur(x);

	}

}
