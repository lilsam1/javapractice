package ch_06_method;

import java.util.Scanner;

public class Ex_03 {
	/*
	 ���Ϻ��� ������ �����ﰢ���� ǥ���ϼ���
	 ���� ��µǴ� �κ��� putStars() �޼��带 �����ؼ� �����ϼ���
	 
	 �� �� : 4
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
		
		System.out.println("���Ϻ��� ������ �����ﰢ���� ǥ���մϴ�.");
		System.out.print("�� �� : ");
		int total = stdin.nextInt();
		
		for(int i = 1; i <= total; i++) {
			putStars(i, total); //putStars() �޼��� ȣ��
			System.out.println();
		}

	}

}
