package ch_08_inheritance;

class Car2 {
	// �����ڰ� ������ �ڵ����� �Ű������� ���� �����ڰ� �������
	// �����ڸ� �����ϸ� �Ű������� ���� �����ڰ� ��������� ����
	int wheel;
	int speed;
	String color;
	
	public Car2(String color) {
		this.color = color;
	}
}

class SportsCar2 extends Car2 {
	int speedLimit;
	
	SportsCar2(String color, int speedLimit) {
		// �ڽ� Ŭ������ ��ü�� ��������� �ڽ� Ŭ������ �����ڰ� �ڵ����� ������ �ǰ�
		// �ڽ� Ŭ������ �����ڰ� ����Ǳ� ���� �θ� Ŭ������ �����ڰ� �ڵ����� ����
		// �θ� Ŭ������ �����ڸ� �ڵ����� ������ �θ� Ŭ������ �Ű������� ���� �����ڰ� �ڵ����� ���� ex) super();
		super(color);
		
		this.speedLimit = speedLimit;
	}
}

public class Inheritance_exam05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SportsCar2 sportsCar = new SportsCar2("red",330);
		
		System.out.println(sportsCar.color);
		System.out.println(sportsCar.speedLimit);
		

	}

}
