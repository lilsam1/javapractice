package ch_04_control;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* ����ڿ��� �Է¹��� ������ �������
		   0���� �������� �˷��ִ� �ڵ带 �ϼ�
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է����ּ���: ");
		int num = sc.nextInt();
		
		if(num > 0 ) {
			System.out.println("�Է¹��� ���ڴ� ����Դϴ�");
		}
		else if(num == 0) {
			System.out.println("�Է¹��� ���ڴ� 0�Դϴ�");
		}
		else {
			System.out.println("�Է¹��� ���ڴ� �����Դϴ�");
		}
	}

}
