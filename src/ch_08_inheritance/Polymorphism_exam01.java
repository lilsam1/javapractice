package ch_08_inheritance;

class A {
	void methodA() {
		System.out.println("methodA");
	}
}

class B extends A{
	void methodB() {
		System.out.println("methodB");
	}
}

public class Polymorphism_exam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj = new B();
		obj.methodA();
//		obj.methodB();	// ���� �߻�
		
		B obj1 = new B();
		obj1.methodA();
		obj1.methodB();
		
		A obj2 = obj1;	// A ������ Ÿ���� obj2�� obj1 ����
		obj2.methodA();
//		obj2.methodB();	// ���� �߻�

	}

}
