package ch_08_inheritance;

class Car1 {
	String color;
	int door;
	
	void drive() {	// �����ϴ� ���
		System.out.println("drive, Brrr~");
	}
	void stop() {	// ���ߴ� ���
		System.out.println("Stop");
	}
}

class FireEngine extends Car1 {	// �ҹ���
	void water() {				// �� �Ѹ��� ���
		System.out.println("water");
	}
}

public class Polymorphism_exam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �������� ����ȯ - �ڽ� Ÿ�Կ��� �θ� Ÿ�����δ� �ڵ� ����ȯ������ �θ𿡼� �ڽ�Ÿ�����δ� ����� ����ȯ
		
		Car1 car1;	// ���������� ����
		FireEngine fe = new FireEngine();
		FireEngine fe2;	// ���������� ����
		
		fe.water();
		car1 = fe;		// car1 = (Car1)fe; ���� ����ȯ�� ������ ����
//		car1.water();	// Car1 Ÿ���� ���������δ� water()�� ȣ���� �� ����
		fe2 = (FireEngine)car1;	// �θ�Ÿ�Կ��� �ڽ�Ÿ������ ���Ե� ���� ����ȯ�� �������
		fe2.water();

	}

}
