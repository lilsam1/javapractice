package ch_08_inheritance;

class Animal {
	void walk() {
		System.out.println("���� �� ����");
	}
}

class Bird extends Animal {
	void fly() {
		System.out.println("���� �� ����");
	}
	void sing() {
		System.out.println("�뷡 �θ� �� ����");
	}
}

/*
 ������ ��Ÿ���� Animal Ŭ������ ��ӹ޾� ���� ��Ÿ���� bird Ŭ������ �ۼ�
 */

public class Ex_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bird bird = new Bird();
		bird.walk();	// ���� �� ����
		bird.fly();		// ���� �� ����
		bird.sing();	// �뷡 �θ� �� ����

	}

}
