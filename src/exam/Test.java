package exam;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		Scanner output = new Scanner(System.in);
		
		// ��������
		int account = 10000; // �ܾ� : ���۽� 10000��
		int addMoney; // �Աݾ�
		int outMoney; // ��ݾ�
		
		// �Աݾ� �Է�
		System.out.println("�Ա� �ݾ��� �Է����ֽʽÿ�");
		addMoney = input.nextInt(); 
		account += addMoney;
		
		System.out.println("�Ա��Ͻ� �ݾ��� " + addMoney + "���̰� �ܾ��� " + account + "�� �Դϴ�.");
		
		// �ܾ��� 0�� �ɶ����� ��ݾ� �Է�
		while(true) {
			System.out.println("��� �ݾ��� �Է����ֽʽÿ�");
			outMoney = output.nextInt();
			
			if(account == 0) { // �ܾ��� 0�� �Ǹ� �ݺ��� ����ǵ���
				break;	
			}
			else if(account >= outMoney) { // ��ݾ��� �Է¹����� �ܾ׿��� ����ó�� �� ��� �ݾ� �� �ܾ� ���
				account -= outMoney;
				System.out.println(outMoney + "���� ���ó���߰� �ܾ��� " + account + "���Դϴ�." );
				if(account == 0) {
					break;
				}
			}
			else if(account < outMoney) { // �ܾ׺��� �� ���� �ݾ��� ����ϰ��� �ϸ� ���� ó���� ���� �ʵ��� ó��
				outMoney = 0;
				System.out.println("�ܾ��� " + account + "���ε� ��ݾ� " + outMoney + "���� �� Ŀ�� ����� �ȵ˴ϴ�.");
			}
			else if(outMoney == 0) { // 0���� �Էµ� ��� ���� ó���� ���� �ʵ��� ó��
				outMoney = 0;
				System.out.println("0���� �Է��ϼ̽��ϴ�. Ȯ���Ͻð� �ٽ� �Է��� �ֽʽÿ�.");
			}
		}
		// �ܾ��� ��� ��ݵǾ� 0���� �Ǹ� ���� ��� �� ���α׷� ���� 
		System.out.println("�ܾ��� 0���̾ �ŷ��� ����˴ϴ�. �����մϴ�.");
		input.close();
		output.close();
	}

}
