package ch_04_control;

import java.util.Scanner;

public class while_exam08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 ������ �Էµ� ������
		 ����ڰ� �Է��� ������ �հ踦 ����Ͽ� ����ϴ� ���α׷��� �ۼ�
		 while���� ���, break ������� �� ��
		 */
		
		int value = 0;
		int sum = 0;
		Scanner scanner = new Scanner(System.in);
		// while���� ������ 1) ó���� ���� �Ǿ�� �ϰ� 2)�տ� ������ ��ġ�� �ʾƾ� ��
		
		while(value >= 0) {
			sum += value;
			System.out.println("������ �Է����ּ���");
			value = scanner.nextInt();
		}
		System.out.println("������ �հ�� " + sum + "�Դϴ�");

	}

}
