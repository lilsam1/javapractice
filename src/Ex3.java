import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		Scanner output = new Scanner(System.in);
		
		int account = 10000;
		int addMoney;
		int outMoney;
		
		System.out.println("입금 금액을 입력해주십시요");
		addMoney = input.nextInt(); 
		account += addMoney;
		
		System.out.println("입금하신 금액은 " + addMoney + "원이고 잔액은 " + account + "원 입니다.");
		
		while(true) {
			System.out.println("출금 금액을 입력해주십시요");
			outMoney = output.nextInt();

			
			if(account == 0) {
				break;
			}
			else if(account >= outMoney) {
				account -= outMoney;
				System.out.println(outMoney + "원을 출금처리했고 잔액은" + account + "원입니다." );
				if(account == 0) {
					break;
				}
			}
			
			else if(account < outMoney) {
				outMoney = 0;
				System.out.println("잔액은 " + account + "원인데 출금액" + outMoney + "원이 더 커서 출금이 안됩니다.");
				
			}
			else if(outMoney == 0) {
				outMoney = 0;
				System.out.println("0원을 입력하셨습니다. 확인하시고 다시 입력해 주십시요.");
			}
				
		}
		System.out.println("잔액이 0원이어서 거래가 종료됩니다. 감사합니다.");
		input.close();
		output.close();
		
	

	}

}
