package ch_06_method;

import java.util.Random;
import java.util.Scanner;

public class method_exam09 {
	// �μ��� ���� �޼���
	// �ϻ� ���� ���α׷�
	
	static Scanner stdin = new Scanner(System.in);	// �� �޼��忡�� ����ϱ� ���� Ŭ���� ������ ����
	
	//���� ������ Ȯ��
	static boolean confirmRetry() {	// �Ű������� ���޹��� �ʴ� �޼���
		int cont;
		do {
			System.out.print("�ٽ� �ѹ�? <Yes-1/No-0> : ");
			cont = stdin.nextInt();
		} while ( cont != 0 && cont !=1);
		return cont == 1;	//cont�� 1�̸� true, �ƴϸ� false
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		
		System.out.println("�ϻ� Ʈ���̴�!");
		do {
			// random.nextInt(n) : 0 ~ (n - 1) ������ ������ �������� ��ȯ
			int x = rand.nextInt(900) + 100;	// 3�ڸ����� ��
			int y = rand.nextInt(900) + 100;	// 3�ڸ����� ��
			int z = rand.nextInt(900) + 100;	// 3�ڸ����� ��
			
			while (true) {
				System.out.print(x + " + " + y + " + " + z + " = ");
				int k = stdin.nextInt();
				if (k == x + y + z)
					break;
				System.out.println("Ʋ�Ƚ��ϴ�!");
			}
		}while (confirmRetry());

	}

}