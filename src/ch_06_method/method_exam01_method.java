package ch_06_method;

import java.util.Scanner;

public class method_exam01_method {
	
	static int max(int a, int b, int c) { //a,b,c�� �ִ밪�� ��ȯ
		int max= a;
		if(b > max) max = b;
		if(c > max) max = c;
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// �޼���� �� �ʿ��Ѱ� - method_exam01.java���� �ۼ��� ���� �޼��带 �̿��ؼ� �ٿ�����
		// 3���� ����, ü��, ������ �ִ밪�� ���ؼ� ǥ��
		
		
		Scanner stdin = new Scanner(System.in);
		
		int[] height = new int[3];	// ����
		int[] weight = new int[3];	// ü��
		int[] age = new int[3];		// ����
		
		for (int i = 0; i < 3; i++) {	// �Է�
			System.out.print("[" + (i + 1) +"]");
			System.out.print("����:");	height[i] = stdin.nextInt();
			System.out.print("	ü��:");	weight[i] = stdin.nextInt();
			System.out.print("	����:");	age[i] = stdin.nextInt();
		}
		
		//������ �ִ밪�� ���Ѵ�
		int maxHeight = max(height[0], height[1], height[2]);
		int maxWeight = max(weight[0], weight[1], weight[2]);
		int maxAge = max(age[0], age[1], age[2]);
		
		
		System.out.println("������ �ִ밪�� " + maxHeight + "�Դϴ�.");
		System.out.println("ü���� �ִ밪�� " + maxWeight + "�Դϴ�.");
		System.out.println("������ �ִ밪�� " + maxAge + "�Դϴ�.");

	}

}
