package ch_04_control;

import java.util.Scanner;

public class Ex02_Switch {

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
		//switch������ ����� 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ���");
		int grade = sc.nextInt();
		grade = (grade / 10) * 10;
		
		switch(grade) {
		case 90: case 100: 
			System.out.println("A");
			break;
		case 80:
			System.out.println("B");
			break;
		case 70:
			System.out.println("C");
			break;
		case 60:
			System.out.println("D");
			break;
		default :
			System.out.println("F");
		}
		

	}

}
