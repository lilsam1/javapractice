package ch_08_inheritance;

// 상속과 멤버변수
class Parent {
	int x = 10;
}

class Child extends Parent {
	void method() {
		System.out.println("x = " + x);
		System.out.println("this.x = " + this.x);	// this는 내 자신
		System.out.println("super.x = " + super.x);	// super는 부모 클래스의 x
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
