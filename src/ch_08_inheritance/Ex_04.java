package ch_08_inheritance;

class Animal {
	void walk() {
		System.out.println("걸을 수 있음");
	}
}

class Bird extends Animal {
	void fly() {
		System.out.println("날을 수 있음");
	}
	void sing() {
		System.out.println("노래 부를 수 있음");
	}
}

/*
 동물을 나타내는 Animal 클래스를 상속받아 새를 나타내는 bird 클래스를 작성
 */

public class Ex_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bird bird = new Bird();
		bird.walk();	// 걸을 수 있음
		bird.fly();		// 날을 수 있음
		bird.sing();	// 노래 부를 수 있음

	}

}
