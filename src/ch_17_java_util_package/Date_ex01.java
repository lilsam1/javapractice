package ch_17_java_util_package;

import java.util.Date;

public class Date_ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date today = new Date();	// 기본 생성자로 Date 인스턴스를 만들고 출력
		System.out.println(today);
		
		long a = System.currentTimeMillis();
		Date today2 = new Date(a);	// long 타입을 파라미터로 받아 인스턴스 생성 후 출력
		System.out.println(today2);
	}

}
