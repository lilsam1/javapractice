package ch_08_inheritance;

class Car2 {
	// 생성자가 없으면 자동으로 매개변수가 없는 생성자가 만들어짐
	// 생성자를 정의하면 매개변수가 없는 생성자가 만들어지지 않음
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
		// 자식 클래스의 객체가 만들어지면 자식 클래스의 생성자가 자동으로 실행이 되고
		// 자식 클래스의 생성자가 실행되기 전에 부모 클래스의 생성자가 자동으로 실행
		// 부모 클래스의 생성자를 코딩하지 않으면 부모 클래스의 매개변수가 없는 생성자가 자동으로 실행 ex) super();
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
