package ch_05_array;

import java.util.Scanner;

public class Ex_03Q {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 Ű����κ��� �л� ���� �� �л����� ������ �Է¹޾Ƽ�, �ְ� ���� �� ��� ������ ���ϴ� ���α׷��Դϴ�
		 �������� ���� �˸°� �ۼ��� ������.
		 */
		
		boolean run = true;	//�ݺ����� �������� ��� --> ���� false�� �ȴٸ� �ݺ����� ����
		int studentNum = 0;
		int[] scores = null;	//������ �Է¹��� �� �迭 ����, ����ڿ��� �Է¹��� �л����� �������� �迭 ����,
		Scanner scanner = new Scanner(System.in);
		while (run) {
			System.out.println("-------------------------------------");
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
			System.out.println("-------------------------------------");
			System.out.println("����> ");
			int selectNo = Integer.parseInt(scanner.nextLine());
			if (selectNo == 1) {
				// �ۼ� ��ġ �л����� �Է� �޾Ƽ� �迭 ����
			} else if (selectNo == 2) {
				//�ۼ� ��ġ. ������ �迭�� ���� ��ŭ ���� �Է�
			} else if (selectNo == 3) {
				//�ۼ� ��ġ. ������ �Է¹��� �迭�� ���� ���
			} else if (selectNo == 4) {
				//�ۼ� ��ġ. �ְ� ����, ��� ���� ���
			} else if (selectNo == 5) {
				//�ۼ� ��ġ. run �� ����
			} 
			
		}
		

	}

}
