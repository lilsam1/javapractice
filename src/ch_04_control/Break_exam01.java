package ch_04_control;

import java.util.Scanner;

public class Break_exam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* �ݺ����� ���������� ����� 1)���ǽ��� false�� �ǰų� 2)break ���� ����ǰų�
		 * break���� �ݺ��� ���߰���
		 * �ݺ����� ����Ǵٰ� break ���� ������ �� �ٷ� �ݺ����� ��� �ݺ��� ������ �ڵ带 ����
		 */
		
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int num;
		
		while(true) {
			System.out.println("���� ���ڸ� �Է��ϼ���:(�����Ϸ��� 0�Է�)");
			num = scanner.nextInt(); //���� �Է¹޾� i�� ����
			if (num == 0) { //���� 0�� �Է��Ͽ��ٸ� ����
				break;
			}
			sum += num; //�Է¹��� �� �����ֱ�
		}
		System.out.println("��������� ���� = " + sum);

	}

}
