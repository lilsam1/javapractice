package ch_06_method;

import java.util.Scanner;

public class method_exam08 {
	// return ���� ���� �޼���
	// ���Ϻ��� ������ �����ﰢ���� ǥ��
	static void putStars(int n) { // void �޼��� -> return ���� ���� �޼���
		// ���� '*'�� n�� ���� ǥ��
		while (n-- > 0)
			System.out.print('*');
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
		
		System.out.println("���Ϻ��� ������ �����ﰢ���� ǥ���մϴ�");
		System.out.print("�� �� :");
		int n = stdin.nextInt();
		
		for (int i = 1; i <= n; i++) {
			putStars(i);
			System.out.println();
		}

	}

}
