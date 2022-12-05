package ch_08_inheritance;

/*
 �Ӽ�: ������(maker), �� �̸�(model), ����(color), ���� �ӵ�(carSpeed)
 ����: ����(speedUp), ����(speedDown)
 
 1. �� �Ӽ��� ���� ������ �������� �ϴ� Car Ŭ������ ����
 �� ���Ӱ� ������ ����� carSpeed�� �����Ǿ�� �Ѵ�
 
 2.������ Car Ŭ������ �Ķ���ͷ� ��� �ʵ带 �ʱ�ȭ�ϴ� �����ڸ� �߰��ϰ� �Ӽ��� �ٸ� �ν��Ͻ� �� ���� ����
 
 3.Car Ŭ������ ��ӹ޴� SportCar Ŭ������ �����ϰ�, ���Ӱ� ���� �޼��带 ������ī�� �°� �������̵� (���Ӱ� ������ �� ������ �̷��������)
 */

class Car {
	private String maker, model, color;
	int carSpeed;
	
	public void speedUp(){
		this.carSpeed++;
	}
	public void speedDown() {
		this.carSpeed--;
	}

	Car(String maker, String model, String color, int carSpeed) {
		this.maker = maker;
		this.model = model;
		this.color = color;
		this.carSpeed = carSpeed;
	}
}

class SportCar extends Car {
	public SportCar(String maker, String model, String color, int carSpeed) {
		super(maker, model, color, carSpeed);
	}

	@Override
	public void speedUp() {
		// TODO Auto-generated method stub
		this.carSpeed+= 10;
//		super.speedUp();
	}

	@Override
	public void speedDown() {
		// TODO Auto-generated method stub
		this.carSpeed-= 10;
//		super.speedDown();
	}
	
}

public class Ex_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car("hyndai","grander","black",0);
		Car car2 = new Car("hyndai","ionic","grey",0);
		Car car3 = new Car("kia","k5","white",0);

	}

}
