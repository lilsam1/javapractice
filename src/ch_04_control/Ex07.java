package ch_04_control;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* while, break�� ����Ͽ� ����ڰ� �Է��� �������� ����� ���� ���α׷��� �ۼ��մϴ�
		 * ���� �ۼ��ڰ� ������ �Է��ϸ� break�� ���Ͽ� �ݺ� ��ǥ�� ����ǰ� �մϴ�
		 */
		
		//���� �ڵ带 �ۼ��ϴ� ��� = ���ʿ��� �ڵ带 ���̰�, ����Ƚ���� ���̰�, �޸𸮸� �� �����ϵ���
		
		Scanner sc = new Scanner(System.in);
		int grade;
		int total = 0;
		int count = 0;
		
		while (true) {
			System.out.println("������ �Է��ϼ���");
			grade = sc.nextInt();
			if (grade < 0) {
				break;
				}
			total += grade;
			count++;
		}
		System.out.println("�Է��� ������ ����� " + total / (double) count + "�Դϴ�");
	}

}