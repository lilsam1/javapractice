package ch_08_inheritance;

class Circle {
	protected int radius;	// 반지름
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
		System.out.println("피자의 종류 : " + menu + ", 피자의 크기 : " + (radius*2));
	}
	
}

/*
 원을 나타내는 Circle 클래스를 상속받아 피자를 나타내는 Pizza 클래스를 작성
 */

public class Ex_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pizza pizza = new Pizza("Pepperoni", 10);
		pizza.print();	// 피자의 종류 : Pepperoni, 피자의 크기 : 20

	}

}
