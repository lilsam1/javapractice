package ch_04_control;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* do while ���� ����ؼ� ����ڷκ��� ���� ��ȣ�� �Է¹޴� ���α׷��� �ۼ��غ�����
		 * ����ڰ� �ùٸ� �� ��ȣ�� �Է��� ������ �ݺ��� ����մϴ�
		 * ����ڰ� �ùٸ� �� ��ȣ�� �Է��ؾ߸� ���� �������� �Ѿ�ϴ�
		 */
		Scanner scanner = new Scanner(System.in);
		int month;
		
		do {
			System.out.print("�ùٸ� ���� �Է��ϼ��� [1-12]");
			month = scanner.nextInt();
		} while (month < 1 || month > 12);
		System.out.println("����ڰ� �Է��� ���� " + month + "�Դϴ�");
		
	}

}
