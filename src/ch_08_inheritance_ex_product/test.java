package ch_08_inheritance_ex_product;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buyer buyer = new Buyer();
		Product tv = new Tv();
		Product com = new Computer();
		Product audio = new Audio();
		
		buyer.buy(com);
		buyer.buy(tv);
		buyer.buy(audio);
		buyer.summary();
		System.out.println();
		
		
		System.out.println("���� ���� ���� " + buyer.money + "�����Դϴ�");
		System.out.println("���� ���ʽ� ������ " + buyer.bonusPoint + "�Դϴ�");

	}

}
