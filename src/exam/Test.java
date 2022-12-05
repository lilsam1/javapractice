package exam;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		Scanner output = new Scanner(System.in);
		
		// 변수지정
		int account = 10000; // 잔액 : 시작시 10000원
		int addMoney; // 입금액
		int outMoney; // 출금액
		
		// 입금액 입력
		System.out.println("입금 금액을 입력해주십시요");
		addMoney = input.nextInt(); 
		account += addMoney;
		
		System.out.println("입금하신 금액은 " + addMoney + "원이고 잔액은 " + account + "원 입니다.");
		
		// 잔액이 0원 될때까지 출금액 입력
		while(true) {
			System.out.println("출금 금액을 입력해주십시요");
			outMoney = output.nextInt();
			
			if(account == 0) { // 잔액이 0원 되면 반복문 종료되도록
				break;	
			}
			else if(account >= outMoney) { // 출금액을 입력받으면 잔액에서 차감처리 후 출금 금액 및 잔액 출력
				account -= outMoney;
				System.out.println(outMoney + "원을 출금처리했고 잔액은 " + account + "원입니다." );
				if(account == 0) {
					break;
				}
			}
			else if(account < outMoney) { // 잔액보다 더 많은 금액을 출금하고자 하면 차감 처리가 되지 않도록 처리
				outMoney = 0;
				System.out.println("잔액은 " + account + "원인데 출금액 " + outMoney + "원이 더 커서 출금이 안됩니다.");
			}
			else if(outMoney == 0) { // 0원이 입력된 경우 차감 처리가 되지 않도록 처리
				outMoney = 0;
				System.out.println("0원을 입력하셨습니다. 확인하시고 다시 입력해 주십시요.");
			}
		}
		// 잔액이 모두 출금되어 0원이 되면 문장 출력 후 프로그램 종료 
		System.out.println("잔액이 0원이어서 거래가 종료됩니다. 감사합니다.");
		input.close();
		output.close();
	}

}
