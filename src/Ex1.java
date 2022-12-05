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
		
		System.out.println("입금 금액을 입력해주십시요");
		int addMoney = input.nextInt(); 
		account = balance + addMoney;
		
		System.out.println("입금하신 금액은 " + addMoney + "원이고 잔액은 " + (account) + "원 입니다");
		
		while(true) {
			System.out.println("출금 금액을 입력해주십시요");
			outMoney = output.nextInt();
			
			account -= outMoney;
			System.out.println(outMoney + "원을 출금처리했고 잔액은" + account + "원입니다" );
			
			if(account == 0) {
				break;
			}
			
		}


	}

}
