package ch_04_control;

import java.util.Scanner;

public class If_exam05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stdin = new Scanner(System.in);
		System.out.println("������ ǥ���մϴ�. \n �� ���Դϱ�? :");
		int month = stdin.nextInt();
		
		if (month >= 3 && month <=5 ) {
			System.out.println("���Դϴ�");
		}
		else if (month >= 6 && month <= 8) {
			System.out.println("�����Դϴ�");
		}
		else if (month >= 9 && month <= 11) {
			System.out.println("�����Դϴ�");
		}
		else if (month == 12 || month == 1 || month == 2) {
			System.out.println("�ܿ��Դϴ�");
		}
		else {
			System.out.println("�߸��� �Է� ���Դϴ�");
		}

	}

}
