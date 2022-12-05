package ch_08_inheritance;

public class Polymorphism_exam07 {
	
	// p가 참조하는 인스턴스에 자기소개를 시킨다
	static void intro(Pet p) {
		p.introduce();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 애완동물 클래스의 이름 예)메서드의 인수로 다형성을 검증
		Pet[] a = {
				new Pet("Kurt","아이"),
				new RobotPet("R2D2", "루크"),
				new Pet("마이클", "영진"),
		};
		
		for(Pet p : a) {
			intro(p);			// p가 참조하는 인스턴스에 자기소개를 시킨다
			System.out.println();
		}

	}

}
