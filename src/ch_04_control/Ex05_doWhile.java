package ch_04_control;
import java.util.Scanner;

public class Ex05_doWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* ������ �Էµ� ������
		 * ����ڰ� �Է��� ������ �հ踦 ����Ͽ� ����ϴ� ���α׷��� �ۼ�
		 * while���� ����ϰ�, break�� ������� ����
		 */
		
		Scanner sc = new Scanner(System.in);
		int num;
		int sum = 0;	
		
		do {
			System.out.print("������ �Է��ϼ���");
			num = sc.nextInt();
			if (num >= 0) {
				sum += num;
			}
		} while(num >= 0);
		System.out.println("������ �հ�� " + sum + "�Դϴ�");
		
	}

}
