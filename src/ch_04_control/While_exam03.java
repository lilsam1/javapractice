package ch_04_control;

import java.util.Scanner;

public class While_exam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String answer = "Y";	//while�� ���۵� �� �ֵ��� ���� ���� �ʱ�ȭ
		int count = 0;
		
		while (answer.equals("Y")) {
			System.out.println("������ ����Ͻðڽ��ϱ�");
			answer = scanner.nextLine(); //������� ������ �޽��ϴ�
			
			if (answer.equals("Y")) {
				++count;
				System.out.println("������" + count + "�� ����߽��ϴ�");
			}
		}
		System.out.println("�������");
		
		
		//for���� while������
//		Scanner scanner = new Scanner(System.in);
//		int count = 0;
//		
//		for (String answer = "Y"; answer.equals("Y") || answer.equals("y");) {
//			System.out.println("������ ����Ͻðڽ��ϱ�(Y)");
//			answer = scanner.nextLine();
//			if (answer.equals("Y") || answer.equals("y")) {
//				count++;
//				System.out.println("������ " + count + "�� ����߽��ϴ�");
//			}
//		}
//		System.out.println("�������");

	}

}
