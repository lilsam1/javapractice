package ch_08_inheritance;

class Aniaml {
	void breath() {
		System.out.println("숨쉬기");
	}
}

class Lion extends Animal {
	@Override
	public String toString() {
		return "사자";
	}
}

class Rabbit extends Animal {
	public String toString() {	// 동물 클래스를 상속한 토끼 클래스
		return "토끼";
	}
}

class Monkey extends Animal {
	public String toString() {	// 동물 클래스를 상속한 원숭이 클래스
		return "원숭이";
	}
}

class Zookeeper {	// 사육사 클래스
	void feed(Animal animal) {	//먹이 주는 메서드
		System.out.println(animal + "에게 먹이 주기");
	}

//	통합
//	void feed(Lion lion) {	// 사자에게 먹이 주는 메서드
//		System.out.println(lion + "에게 먹이 주기");
//	}
//	void feed(Rabbit rabbit) {// 토끼에게 먹이 주는 메서드
//		System.out.println(rabbit + "에게 먹이 주기");
//	}
//	void feed(Monkey monkey) {	// 사자에게 먹이 주는 메서드
//		System.out.println(monkey + "에게 먹이 주기");
//	}
	
}

public class Polymorphism_exam08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal lion = new Lion();	// Lion 인스턴스 생성
		Zookeeper james = new Zookeeper();	// james라는 이름의 사육사 인스턴스 생성
		james.feed(lion);	// james가 lion에게 먹이를 줌
		
		Animal rabbit = new Rabbit();
		james.feed(rabbit);;
		
		Animal monkey = new Monkey();
		james.feed(monkey);

	}

}
