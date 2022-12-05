package ch_08_inheritance;

/*
 속성: 제조사(maker), 모델 이름(model), 색상(color), 현재 속도(carSpeed)
 행위: 가속(speedUp), 감속(speedDown)
 
 1. 이 속성과 행위 설명을 바탕으로 하는 Car 클래스를 정의
 단 가속과 감속의 결과는 carSpeed와 연동되어야 한다
 
 2.정의한 Car 클래스에 파라미터로 모든 필드를 초기화하는 생성자를 추가하고 속성이 다른 인스턴스 세 개를 생성
 
 3.Car 클래스를 상속받는 SportCar 클래스를 정의하고, 가속과 감속 메서드를 스포츠카에 맞게 오버라이딩 (가속과 감속이 더 빠르게 이루어지도록)
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
