import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input= new Scanner(System.in);
		Scanner output = new Scanner(System.in);
		
		int balance = 10000;
//		int addMoney = 0;
		int account;
		int outMoney;
		
		System.out.println("�Ա� �ݾ��� �Է����ֽʽÿ�");
		int addMoney = input.nextInt(); 
		account = balance + addMoney;
		
		System.out.println("�Ա��Ͻ� �ݾ��� " + addMoney + "���̰� �ܾ��� " + (account) + "�� �Դϴ�");
		
		while(true) {
			System.out.println("��� �ݾ��� �Է����ֽʽÿ�");
			outMoney = output.nextInt();
			
			account -= outMoney;
			System.out.println(outMoney + "���� ���ó���߰� �ܾ���" + account + "���Դϴ�" );
			
			if(account == 0) {
				break;
			}
			
		}


	}

}
