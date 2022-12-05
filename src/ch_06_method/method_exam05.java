package ch_06_method;

public class method_exam05 {
	
	/*
	 매개 변수가 있는 메서드
	 매개 변수는 메서드 호출시 메모리에 생성되고 호출 후 복귀 시 소멸
	 */
	public void print(int a) {
		System.out.println("결과값: " + a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 11;
		int b = 22;
		int result = 0;
		
		// 사용할 메서드가 있는 클래스의 인스턴스 선언
		method_exam05 method = new method_exam05();
		method.print(10);
		method.print(b);
		method.print(result);

	}

}
