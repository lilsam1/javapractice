import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		Scanner output = new Scanner(System.in);
		
		int account = 10000;
		int addMoney;
		int outMoney;
		
		System.out.println("�Ա� �ݾ��� �Է����ֽʽÿ�");
		addMoney = input.nextInt(); 
		account += addMoney;
		
		System.out.println("�Ա��Ͻ� �ݾ��� " + addMoney + "���̰� �ܾ��� " + account + "�� �Դϴ�.");
		
		while(true) {
			System.out.println("��� �ݾ��� �Է����ֽʽÿ�");
			outMoney = output.nextInt();

			
			if(account == 0) {
				break;
			}
			else if(account >= outMoney) {
				account -= outMoney;
				System.out.println(outMoney + "���� ���ó���߰� �ܾ���" + account + "���Դϴ�." );
				if(account == 0) {
					break;
				}
			}
			
			else if(account < outMoney) {
				outMoney = 0;
				System.out.println("�ܾ��� " + account + "���ε� ��ݾ�" + outMoney + "���� �� Ŀ�� ����� �ȵ˴ϴ�.");
				
			}
			else if(outMoney == 0) {
				outMoney = 0;
				System.out.println("0���� �Է��ϼ̽��ϴ�. Ȯ���Ͻð� �ٽ� �Է��� �ֽʽÿ�.");
			}
				
		}
		System.out.println("�ܾ��� 0���̾ �ŷ��� ����˴ϴ�. �����մϴ�.");
		input.close();
		output.close();
		
	

	}

}
