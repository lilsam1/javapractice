package shoppingmall_ex;

import java.util.Scanner;

public class ShopCart {
	Scanner stdin = new Scanner(System.in);
	Cart[] carts = new Cart[10];
	int cntCart = 0;
	
	void selectProduct() {
		int prductID, cnt;
		
		do {
			System.out.print("������ ��ǰ�� ��ȣ�� �Է����ֽʽÿ�>>");
			prductID = stdin.nextInt();
			System.out.print("��ǰ�� ���� ������ �Է����ֽʽÿ�>>>");
			cnt = stdin.nextInt();
			
			carts[cntCart] = new Cart(prductID, cnt);
			cntCart++;
		}
		while (confirmReShopping());
	}
	
	boolean confirmReShopping() {
		while(true) {
			System.out.println("�������� ��ǰ�� �� �����Ͻðڽ��ϱ�?");
			System.out.print("�� ���Ÿ� ���Ͻø� Y, �׸� �����Ͻ÷��� N�� �Է��� �ֽʽÿ�>>>");
			String answer = stdin.next();
			if(answer.equals("Y")) {
				return true;
			}
			else if(answer.equals("N")) {
				return false;
			}
			else {
				System.out.println("�߸��� �Է��Դϴ�");
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
