package ch_06_method;

import java.util.Scanner;

public class method_exam03 {
	/*
	 return�� ���
	 1) ���� ��ȯ 2)�Լ��� ����(�ݺ����� break�� ���)
	 */
	
	static int max(int a, int b) { //a,b�� �ִ밪�� ��ȯ
		// return�� ������ ���͵� �ȴ�
		System.out.println("�Լ� ����");
		if (a > b)
			return a;
		else
			return b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stdin = new Scanner(System.in);
		
		System.out.println("���� a : ");
		int a = stdin.nextInt();
		System.out.println("���� b : ");
		int b = stdin.nextInt();
		
		System.out.println("�ִ밪�� " + max(a, b) + "�Դϴ�.");

	}

}
