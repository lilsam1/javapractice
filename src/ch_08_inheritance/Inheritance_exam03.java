package ch_08_inheritance;

// ��Ӱ� �������
class Parent {
	int x = 10;
}

class Child extends Parent {
	void method() {
		System.out.println("x = " + x);
		System.out.println("this.x = " + this.x);	// this�� �� �ڽ�
		System.out.println("super.x = " + super.x);	// super�� �θ� Ŭ������ x
	}
}

public class Inheritance_exam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child();
		c.method();
		/* 
		 x = 10
		 this.x = 10
		 super.x = 10
		 */

	}

}
