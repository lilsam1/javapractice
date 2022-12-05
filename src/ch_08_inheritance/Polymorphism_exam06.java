package ch_08_inheritance;

public class Polymorphism_exam06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 애완동물 클래스의 이용 예(다형성의 검증)
		// 다형성의 오버라이딩
		Pet kurt;
		kurt = new Pet("kurt", "아이");
		kurt.introduce();	// 내 이름은 kurt입니다 주인님은 아이입니다
		System.out.println();
		
		RobotPet r2d2 = new RobotPet("R2D2", "루크");
		r2d2.introduce();	// 저는 로봇입니다. 이름은 R2D2입니다 주인님은 루크입니다
		r2d2.work(0);
		System.out.println();
		
		Pet toy = new RobotPet("toy", "아이2");
		toy.introduce();	// 저는 로봇입니다. 이름은 toy입니다  주인님은 아이2입니다
//		toy.work(0);	// 오류 발생
		System.out.println();
		
		Pet p = r2d2;
		p.introduce();	// 저는 로봇입니다. 이름은 r2d2입니다   주인님은 루크입니다
		
		System.out.println();

	}

}
