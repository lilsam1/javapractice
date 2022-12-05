package ch_12_ExceptionHandling;

public class TryCatch_ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 10;
		int num2 = 0;
		
		try {
			System.out.println("** 정수값을 0으로 나누는 연산 **");
			// 부적절한 연산 수행
			System.out.println("10/0=" + (num / num2));
			System.out.println("** 정수값을 0으로 나누는 연산 완료 **");
		} catch(Exception e) {	// Exception 클래스 e 객체
			System.out.println(e);
			System.out.println("0으로 나눌 수 없습니다");
		}
		System.out.println("프로그램을 정상 수행합니다");
	}

}
