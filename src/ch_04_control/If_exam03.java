package ch_04_control;

import java.util.Scanner;

public class If_exam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���̸� �Է��ϼ��� >>> ");
		int age;
		
		age = sc.nextInt();
		
		if (age > 19) { // 20 ~
			System.out.println("�����Դϴ�");
			System.out.println("���� ����� ����˴ϴ�");
		}
		else if (age > 13) { // 14 ~ 19	 // 19�� �̻��� ������ �տ��� �̹� �ɷ����� ������ ���ǿ� �� �ʿ�x 
			System.out.println("û�ҳ��Դϴ�");
			System.out.println("û�ҳ� ����� ����˴ϴ�");
		}
		else if (age > 8) { // 9 ~13
			System.out.println("����Դϴ�");
			System.out.println("��� ����� ����˴ϴ�");
		}
		else { // ~ 8
			System.out.println("�����Դϴ�");
			System.out.println("���� ����� ����˴ϴ�");
		}
		
		System.out.println("������ �������ּ���");
		
		
//		// �ݴ�� ���ƺ��� �����غ���
//		if (age < 9) { 
//			System.out.println("�����Դϴ�");
//			System.out.println("���� ����� ����˴ϴ�");
//		}
//		else if (age < 14) {  
//			System.out.println("����Դϴ�");
//			System.out.println("��� ����� ����˴ϴ�");
//		}
//		else if (age < 20) { 
//			System.out.println("û�ҳ��Դϴ�");
//			System.out.println("û�ҳ� ����� ����˴ϴ�");
//		}
//		else { 
//			System.out.println("�����Դϴ�");
//			System.out.println("���� ����� ����˴ϴ�");
//		}
//		
//		System.out.println("������ �������ּ���");


	}

}
