package ch_04_control;

public class For_exam05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// for���� �̿��ؼ� 1���� 100������ ���� �߿���
		// 3�� ����� ������ ���ϴ� �ڵ带 �ۼ��� ������
		
		// ���� �м�
		// for���� ���� i�� 1���� 100���� ���� ������
		// 3�� ��� ��µǵ��� �����غ��� ( ex_ if���� Ȱ���ؼ� 3�� ����� ����ǵ���)
		
		//1����
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				sum += i;
			}
		}
		System.out.println("3�� ����� ��: " + sum);
		
		//2��°
		sum = 0;
		for(int i = 3 ; i <=100; i += 3) {
			sum += i;
		}
		System.out.println("3�� ����� ��: " + sum);

	}

}
