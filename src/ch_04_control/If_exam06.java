package ch_04_control;

import java.util.Scanner;

public class If_exam06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�� ������ �ִ밪 ���ϱ�
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� a : ");
		int a = sc.nextInt();
		System.out.println("���� b : ");
		int b = sc.nextInt();
		System.out.println("���� c : ");
		int c = sc.nextInt();
		
		int max = a;
		if (b > max) {
			max = b;
		}
		if (c > max) {
			max = c;
		}
		
		System.out.println("�ִ밪 : " + max);
		
		
//		// ����) �� ������ �ּҰ� ���ϱ�

//		int min = a;
//		if (b < min) {
//			min = b;
//		}
//		if (c < min) {
//			min = c;
//		}
//		
//		System.out.println("�ּҰ� : " + min);

	}

}
