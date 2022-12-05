package ch_05_array;

import java.util.Arrays;

public class Ex_Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �ζ� ��ȣ ���ϱ�
		// 1 - 45������ ������ �� ���ϱ�
		// �ߺ� �Ǵ� �� �ִ��� üũ
		
		int[] ball = new int[45];
				
		for(int i = 0; i < ball.length ; i++)
			ball[i] = i + 1;	//ball[0]�� 1�� ����
			
		// �迭�� ����� ���� �� ���̵��� ����� ū �ݺ�Ƚ���� ����
		// �迭�� ù ���� ��ҿ� ������ ��ҿ� ����� ���� ���� �ٲ㼭 ���� ���´�
		for(int i = 0; i < 10000; i++ ) {
			int j = (int)(Math.random() * 45);
			
			int temp = ball[0];
			ball[0] = ball[j];
			ball[j] = temp;
		}
		
		//System.out.println(temp);
		for(int i = 0; i < 6; i++) {
			System.out.print(ball[i] + " ");
		}
		
		System.out.println( );
		System.out.println( );
		
		// �߰��� �����غ� �� - �ʿ��� ���ڴ� 6���ε� 45�����̳� �Ǵ� ��ȣ�� ����� �޸� ������ �� �ʿ䰡 �ִ°�
		// �����ϰ� �ٿ�����
		int range = 6;
		int[] numbers = new int[range];
		
		while(range > 0) {
			int temp = (int)(Math.random() * 45) + 1; //1-45�� ������ ���� ��´�
			
			//�ߺ�Ȯ��
			boolean result = true; // �ߺ� Ȯ�� ���� �����ϱ� ���� ����. �ߺ��̸� false
			for(int n : numbers) {
				if(n == temp) { // �ߺ��� �Ǹ� result �� ����
//					System.out.println(temp + "�� �ߺ��� ���Դϴ�");
					result = false;
				}
			}
			
			if (result) {
				numbers[range-1] = temp;
				range--;
			}
			
		}
		System.out.println(Arrays.toString(numbers));

	}

}
