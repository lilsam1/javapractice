package ch_06_method;

public class method_exam06 {
	// 매개 변수를 2개 사용하는 메서드
	public void print(int a, int b) {
		int c = a + b;
		System.out.println("결과값: " + c);
	}
	
	// 매개 변수로 문자열을 받는 메서드 선언
	public void print1(String str) {
		System.out.println(str);
	}

	public static void main(String[] args) {
		// 변수 선언
		int num1 = 11;
		int num2 = 22;
		int result = 0;
		
		// 사용할 메서드가 있는 클래스의 인스턴스 선언
		method_exam06 method = new method_exam06();
		
		// 메서드 호출
		method.print(10, 20);
//		method.print(10, 30.0f);	실행안됨. 데이터타입 달라서
		method.print1("안녕하세요");

	}

}
