package ch_02_var;

public class Exam003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 상수 : 프로그램 실행 중에 변경할 수 없는 고정된 값. 변수와 다르게 대문자로 선언
		   형식 : final 데이터 타입 상수명  = 값;
		 */
		int a = 3;
		a = 4;
		
		final double PI = 3.14;
		//PI = 3.15 //에러발생
		
		System.out.println(a);
		System.out.println(PI);
	}

}
