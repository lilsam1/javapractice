package ch_04_control;

public class While_exam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// for���� while������ ����
		
		int num;
		int sum = 0;
		
		for (num = 1; num <= 10; num++) {
			sum += num;
		}
		System.out.println("1���� 10������ ���� " + sum + "�Դϴ�");
		
		
		//while���� �ʱⰪ, ���ǽ�, ������ ����
		num = 1;
		sum = 0;
		
		while(num <= 10) {
			sum += num;
			num ++;
			
		}
		System.out.println("1���� 10������ ���� " + sum + "�Դϴ�");

	}

}
