package ch_08_inheritance;

class Parent1 {
	int x = 100;
	void method() {
		System.out.println("Parent Method");
	}
}

class Child1 extends Parent1 {
	int x = 200;
	void method() {
		System.out.println("Child Method");
	}
}

public class Polymorphism_exam04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent1 parent1 = new Child1();
		Child1 child1 = new Child1();
		
		// ���� ���� �켱
		System.out.println("p.x = " + parent1.x);	// p.x = 100
		// �������̵� �켱
		parent1.method();	// Child Method
		
		// ���� ���� �켱
		System.out.println("c.x = " + child1.x);	// c.x = 200
		// �������̵� �켱
		child1.method();	// Child Method

	}

}
