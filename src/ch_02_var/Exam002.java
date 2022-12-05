package ch_02_var;

public class Exam002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 명시적 형변환 : 개발자가 변수의 자료형을 강제로 바꾸는 것
		 형식 : (변환하고자 하는 타입) 변수명
		 값손실이 있나 없나에 따라 출력다름
		 */
		
		int a = 263;
		System.out.println(a);
		
		byte b = (byte) a; //명시적 형변환 263 - 256 = 7  //명시적 형변환 514 = ? 2
		System.out.println(b);
		

	}

}
