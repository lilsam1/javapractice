package ch_04_control;
import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* ������ �Էµ� ������
		 * ����ڰ� �Է��� ������ �հ踦 ����Ͽ� ����ϴ� ���α׷��� �ۼ�
		 * while���� ����ϰ�, break�� ������� ����
		 */
		
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int sum = 0;	//while���� ������ 1) ó���� ���� �Ǿ�� �ϰ� 2)���� ������ ��ġ�� �ʾƾ� ��
		
		while(num >= 0) {
			sum += num;
			System.out.println("������ �Է�");
			num = sc.nextInt();
			
		}
		System.out.println("������ �հ�� " + sum + "�Դϴ�");

	}

}
