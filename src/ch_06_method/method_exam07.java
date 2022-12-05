package ch_06_method;

public class method_exam07 {
	// 리턴 타입이 있는 메서드
	public int add(int a, int b) {
		int c = a + b;
		return c;
		// return 다음에 위치하는 데이터는 반드시 메서드의 리턴 타입과 일치해야 됨
		// return 3.5;	// 리턴 타입과 다른 데이터형을 반환하면 오류 발생
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 20;
		int result = 0;
		
		method_exam07 method = new method_exam07();
		result = method.add(num1, num2);
		
		System.out.println("두 수의 합은 " + result);	// 메서드의 반환 값을 저장해서 출력
		System.out.println("두 수의 합은 " + method.add(num1, num2));	// 메서드의 반환 값을 바로 출력

	}

}
