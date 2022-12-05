package ch_02_var;

public class MyVar_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// precisionTest
		// 실수형
		
		float f = 1.234567890f;
//		float f3 = 1.2; //뒤에 f 접미사 없어서 에러
		//float f4 = 1.2f;
		
		double d =1.2345678901234567890;
		float f2 = 0.100000001f;	//0.1
		double d2 = 0.1000001;		//double은 접미사 생략
		double d3 = 0.100000000001;
		
		System.out.println(f);	//1.23456789 => 소수점 8자리에서 반올림
		System.out.println(d);	//1.2345678901234567
		System.out.println(f2);	//0.1
		System.out.println(d2);	//0.1000001
		System.out.println(d3);	//0.100000000001
		
	}



}
