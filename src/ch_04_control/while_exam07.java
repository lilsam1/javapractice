package ch_04_control;

import java.util.Scanner;

public class while_exam07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 while���� Scanner�� �̿��ؼ� Ű����� �Է��� �����ͷ� ����, ���, ��ȸ, ���� ����� �����ϴ� �ڵ带 �ϼ�
		 */
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		while (run) {
			System.out.println("------------------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ�  | 4.���� ");
			System.out.println("------------------------------");
			System.out.println("����> ");
			
			// �ڵ� ����
			int menuNum = Integer.parseInt(scanner.nextLine());
			switch (menuNum) {
				case 1:
					System.out.println("���ݾ�>");
					balance += Integer.parseInt(scanner.nextLine());
					break;
				case 2:
					System.out.println("��ݾ�>");
					balance -= Integer.parseInt(scanner.nextLine());
					break;
				case 3:
					System.out.println("�ܰ�>");
					System.out.println(balance);
					break;
				case 4:
					run = false;
					break;
			}
			// �ڵ� ����
		}
		System.out.println("���α׷� ����");

	}

}
