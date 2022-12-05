package ch_08_inheritance;

class Person { // ��� Ŭ����(�θ�)
	void breath() {
		System.out.println("������");
	}
	void eat() {
		System.out.println("��Ա�");
	}
	void say() {
		System.out.println("���ϱ�");
	}
}

class Student extends Person{	// ��� Ŭ������ ����� �л� Ŭ����
	void learn() {
		System.out.println("����");
	}
}

class Teacher extends Person {	// ��� Ŭ������ ����� ���� Ŭ����
	void teach() {
		System.out.println("����ġ��");
	}
}

public class Inheritance_exam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();	// �л� �ν��Ͻ� s1 ����
		s1.breath();				// ��� Ŭ������ breath �޼��带 ��ӹ޾���
		s1.learn();
		s1.say();
		
		Teacher t1 = new Teacher();	// ���� �ν��Ͻ� t1 ����
		t1.eat();					// ��� Ŭ������ eat �޼��带 ��ӹ޾���
		t1.teach();
		t1.say();
		
		Person person = new Person();
		person.breath();
//		person.learn();				// ����. �ڽ� Ŭ������ �޼��带 �θ�� ������� ����

	}

}
