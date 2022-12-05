package shoppingmall_ex;

import java.util.Scanner;

public class ShopCart {
	Scanner stdin = new Scanner(System.in);
	Cart[] carts = new Cart[10];
	int cntCart = 0;
	
	void selectProduct() {
		int prductID, cnt;
		
		do {
			System.out.print("구매할 상품의 번호를 입력해주십시오>>");
			prductID = stdin.nextInt();
			System.out.print("상품의 구매 갯수를 입력해주십시오>>>");
			cnt = stdin.nextInt();
			
			carts[cntCart] = new Cart(prductID, cnt);
			cntCart++;
		}
		while (confirmReShopping());
	}
	
	boolean confirmReShopping() {
		while(true) {
			System.out.println("상점에서 상품을 더 구매하시겠습니까?");
			System.out.print("더 구매를 원하시면 Y, 그만 쇼핑하시려면 N을 입력해 주십시오>>>");
			String answer = stdin.next();
			if(answer.equals("Y")) {
				return true;
			}
			else if(answer.equals("N")) {
				return false;
			}
			else {
				System.out.println("잘못된 입력입니다");
			}
		}
	}
	
	void printCart() {
		for(Cart c : carts) {
			if(c != null) 
				System.out.println(c);
		}
	}
	
}
