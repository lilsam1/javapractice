package ch_08_inheritance;

class Parent3 {
	int x = 100;
	void method() {
		System.out.println("Parent Method");
	}
}

class Child3 extends Parent3 {
	int x = 200;
	void method() {
		System.out.println("x = " + x);	// this.x�� ����
		System.out.println("super.x = " + super.x);
		System.out.println("this.x = " + this.x);
	}
}

public class Polymorphism_exam05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent3 parent3 = new Child3();
		Child3 child3 = new Child3();
		
		// ���� ���� �켱
		System.out.println("p.x = " + parent3.x);	// p.x = 100
		// �������̵� �켱
		parent3.method();	// Child Method
		
		// ���� ���� �켱
		System.out.println("c.x = " + child3.x);	// c.x = 200
		// �������̵� �켱
		child3.method();	// Child Method

	}

}
