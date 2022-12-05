package ch_08_inheritance;

class Circle {
	protected int radius;	// ������
	public Circle (int radius) {
		this.radius = radius;
	}
}
class Pizza extends Circle {
	private String menu;
	public Pizza (String menu, int radius) {
		super(radius);
		this.menu = menu;
	}
	void print() {
		System.out.println("������ ���� : " + menu + ", ������ ũ�� : " + (radius*2));
	}
	
}

/*
 ���� ��Ÿ���� Circle Ŭ������ ��ӹ޾� ���ڸ� ��Ÿ���� Pizza Ŭ������ �ۼ�
 */

public class Ex_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pizza pizza = new Pizza("Pepperoni", 10);
		pizza.print();	// ������ ���� : Pepperoni, ������ ũ�� : 20

	}

}
