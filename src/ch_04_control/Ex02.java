package ch_04_control;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* ����ڿ��� ������ �Է¹޾�
		 * if���� ����ؼ� ������ ����ϴ� �ڵ带 �ϼ��ϼ���
		 * �Է��� 0 ~ 100���� �Է��� �˴ϴ�
		 * ������ �Ʒ��� �����ϴ�
		 * A : 90 ~ 100
		 * B : 80 ~ 89
		 * C : 70 ~ 79
		 * D : 60 ~ 69
		 * F : 0 ~ 59
		 */
		//�ڹٽ�ũ��Ʈ ��ȿ�� �˻�� 100���� ������ �Է¹޴´� ����
		//�ڵ� ���� �� �ִ� �κ� �����غ��� �����ϰ� ���� 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ���");
		int grade = sc.nextInt();
		
		if (grade >= 90) {
			System.out.println("���� : A");
		}
		else if (grade >= 80) {
			System.out.println("���� : B");
		}
		else if (grade >= 70) {
			System.out.println("���� : C");
		}
		else if (grade >= 60) {
			System.out.println("���� : D");
		}
		else {
			System.out.println("���� : F");
		}

	}

}
