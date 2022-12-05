package ch_02_var;

public class MyVar_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 기본 타입과 문자열 간의 변환
		  기본 타입의 값을 문자열로 변환하는 경우 String.valueOf() 메소드 이용
		  String str = STring.valueOf(기본타입값)
		*/
		
		//기본 타입을 문자열로 변환
		String str1 = String.valueOf(10);
		String str2 = String.valueOf(3.14);
		String str3 = String.valueOf(false);
		
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		System.out.println("str3 : " + str3);
	}

}
