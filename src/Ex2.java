import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input= new Scanner(System.in);
		Scanner output = new Scanner(System.in);
		
		int account = 10000;
//		int addMoney = 0;
		int outMoney;
		
		System.out.println("�Ա� �ݾ��� �Է����ֽʽÿ�");
		int addMoney = input.nextInt(); 
		account += addMoney;
		
		System.out.println("�Ա��Ͻ� �ݾ��� " + addMoney + "���̰� �ܾ��� " + (account) + "�� �Դϴ�");
		
		while(true) {
			System.out.println("��� �ݾ��� �Է����ֽʽÿ�");
			outMoney = output.nextInt();

			
			if(account == 0) {
				break;
			}
			else if(account < outMoney) {
				outMoney = 0;
				System.out.println("�ܾ��� " + account + "���ε� ��ݾ�" + outMoney + "���� �� Ŀ�� ����� �ȵ˴ϴ�.");
				continue;
			}
			else if(outMoney == 0) {
				outMoney = 0;
				System.out.println("0���� �Է��ϼ̽��ϴ�. Ȯ���Ͻð� �ٽ� �Է��� �ֽʽÿ�.");
			}
			
			account -= outMoney;
			System.out.println(outMoney + "���� ���ó���߰� �ܾ���" + account + "���Դϴ�" );
			
			
		}
		System.out.println("�ܾ��� 0���̾ �ŷ��� ����˴ϴ�. �����մϴ�");

	}

}
