package ch_06_method;

public class method_exam04 {
	
	public void print() {
		System.out.println("메서드를 호출합니다");
		
		return;
	}
	/* 
	 매개 변수와 리턴 타입이 없는 메서드
	 
	 리턴 타입이 없더라도 return을 사용할 수 있음
	 다만 return 다음에 값이 없어야 됨
	 return의 의미는 이 부분에서 메서드 실행을 종료하고 복귀한다는 의미
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 1;
		int b = 2;
		int result = 0;
		
		// 사용할 메서드가 있는 클래스의 인스턴스 선언
		method_exam04 method = new method_exam04();
		method.print();
		method.print();
		method.print();

	}

}
