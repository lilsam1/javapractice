package ch_12_ExceptionHandling;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 예외처리
		 프로그램 실행 중 발생하는 오류 중에 처리가 가능한 것을 예외라고 함
		 객체지향 언어인 자바에서는 예외도 객체로 처리 
		 
		 try-catch문 : try문에는 예외가 발생할 수 있는 문장을, catch문에는 예외가 발생할 경우의 처리 방법 작성
		 try-catch문 finally : try-catch문에 finally 구문 추가. try구문 내에서 오류발생하든 하지 않든간에 상관없이 무조건 실행
		 */
		System.out.println("프로그램 시작");
		int a = 0;
		int b = 2;
		int c = b/a;	// 0으로 나눌 수 없어서 예외 발생
		System.out.println("프로그램 종류");
	}

}
