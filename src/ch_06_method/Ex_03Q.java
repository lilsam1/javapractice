package ch_06_method;

import java.util.Scanner;

public class Ex_03Q {
	/*
	 ���Ϻ��� ������ �����ﰢ���� ǥ���ϼ���
	 ���� ��µǴ� �κ��� putStars() �޼��带 �����ؼ� �����ϼ���
	 
	 �� �� : 4
	    *
	   **
	  ***
	 ****
	 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
		
		System.out.println("���Ϻ��� ������ �����ﰢ���� ǥ���մϴ�.");
		System.out.print("�� �� : ");
		int n = stdin.nextInt();
		
		for(int i = 1; i <= n; i++) {
			//putStars() �޼��� ȣ��
			System.out.println();
		}

	}

}
