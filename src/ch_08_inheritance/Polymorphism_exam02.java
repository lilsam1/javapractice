package ch_08_inheritance;

class Car1 {
	String color;
	int door;
	
	void drive() {	// 운전하는 기능
		System.out.println("drive, Brrr~");
	}
	void stop() {	// 멈추는 기능
		System.out.println("Stop");
	}
}

class FireEngine extends Car1 {	// 소방차
	void water() {				// 물 뿌리는 기능
		System.out.println("water");
	}
}

public class Polymorphism_exam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 다형성과 형변환 - 자식 타입에서 부모 타입으로는 자동 형변환되지만 부모에서 자식타입으로는 명시적 형변환
		
		Car1 car1;	// 참조변수만 생성
		FireEngine fe = new FireEngine();
		FireEngine fe2;	// 참조변수만 생성
		
		fe.water();
		car1 = fe;		// car1 = (Car1)fe; 에서 형변환이 생략된 형태
//		car1.water();	// Car1 타입의 참조변수로는 water()를 호출할 수 없음
		fe2 = (FireEngine)car1;	// 부모타입에서 자식타입으로 대입될 때는 형변환을 해줘야함
		fe2.water();

	}

}
