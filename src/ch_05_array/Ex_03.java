package ch_05_array;

import java.util.Scanner;

public class Ex_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 Ű����κ��� �л� ���� �� �л����� ������ �Է¹޾Ƽ�, �ְ� ���� �� ��� ������ ���ϴ� ���α׷��Դϴ�
		 �������� ���� �˸°� �ۼ��� ������.
		 */
		
		boolean run = true;	// �ݺ����� �������� ��� --> ���� false�� �ȴٸ� �ݺ����� ����
		int studentNum = 0;	// �л���
		int[] scores = null;	// ������ �Է¹��� �� �迭 ����, ����ڿ��� �Է¹��� �л����� �������� �迭 ����,
		Scanner scanner = new Scanner(System.in);
		while (run) {
			System.out.println("-------------------------------------");
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
			System.out.println("-------------------------------------");
			System.out.println("����> ");
			int selectNo = Integer.parseInt(scanner.nextLine());
			if (selectNo == 1) {
				System.out.println("�л��� ���� �Է����ּ���");
				studentNum = Integer.parseInt(scanner.nextLine());
				scores = new int[studentNum];
				// �ۼ� ��ġ �л����� �Է� �޾Ƽ� �迭 ����
			} else if (selectNo == 2) {
				System.out.println("������ �Է����ּ���");
				for (int i = 0; i < scores.length; i++) {
					System.out.print("scores[" + i + "]> ");
					scores[i] = Integer.parseInt(scanner.nextLine());
				}
				// ������ �迭�� ���� ��ŭ ���� �Է�
			} else if (selectNo == 3) {
				System.out.println("��������Ʈ�� ������ �����ϴ�");
				for (int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "]: " + scores[i]);
				}
				// ������ �Է¹��� �迭�� ���� ���
			} else if (selectNo == 4) {
				System.out.println("�ְ� ������ ��� ������ ���� �м�����Դϴ�");
				int max = 0;
				int sum = 0;
				double avg = 0;
				for (int i = 0; i < scores.length; i++) {
					max = (max < scores[i]) ? scores[i] : max;
					sum += scores[i];
				}
				avg = (double) sum / studentNum;
				System.out.println("�ְ� ����: " + max);
				System.out.println("��� ����: " + avg);
				// �ְ� ����, ��� ���� ���
			} else if (selectNo == 5) {
				run = false; // run �� ����
			}
		}
		

	}

}
