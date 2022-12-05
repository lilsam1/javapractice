package ch_07_class;

class Area {
	static void manual() {	// static이 있으므로 클래스 메서드
		System.out.println("현재 사용 가능한 함수 목록");
		System.out.println("triangle : 삼각형 넓이");
		System.out.println("rectangle : 사각형 넓이");
		System.out.println("입니다");
		System.out.println();
	}
	
	double triangle(int a, int b) {	// 삼각형 넓이를 반환하는 메서드
		return (double) a * b / 2;
	}
	
	int rectangle(int a, int b) {	// 사각형 넓이를 반환하는 메서드
		return a * b;
	}
}

public class Class_instance_exam_02 {
	/*
	클래스 메서드는 객체를 생성하지 않아도 호출이 가능
	인스턴스 메서드는 객체를 생성해야만 호출이 가능
	왜냐하면 인스턴스 메서드는 객체가 생성되어야 메모리상에 실제로 존재하고
	클래스 메서드는 클래스가 메모리에 올라갈 때 생성되기 때문
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area.manual();			// 클래스 메서드 접근 가능
//		Area.triangle(3, 5);	// 에러 발생	// 인스턴스 생성이 아직 없기에 사용할 수 없음. class Area에서 static double triangle로 바꾸면 클래스 메서드로 접근 가능
//		Area.rectangle(3, 5);	// 에러 발생	// 인스턴스 생성이 아직 없기에 사용할 수 없음. class Area에서 static int rectangle로 바꾸면 클래스 메서드 접근 가능
		
		Area cal = new Area();
		cal.manual();
		System.out.println(cal.triangle(3, 5));		// 인스턴스 생성 후 사용 가능해진 것
		System.out.println(cal.rectangle(3, 4));	// 인스턴스 생성 후 사용 가능해진 것

	}

}
