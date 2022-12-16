package ch_17_java_util_package;

import java.time.LocalDate;

public class Time_ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 클래스들의 정보 값 변경
		 각 클래스에는 필드 값들을 특정 값으로 변경할 수 있는 메서드가 잇음
		 whitYear(int) 년 변경, withMont(int) 월 변경, withDayofYear(int) 년의 일 변경, withDayofMont(int) 월의 일 변경
		*/
		
		// 날짜를 변경하는 코드
		LocalDate ld = LocalDate.now();
		System.out.println(ld);			// 2022-12-16
		
		LocalDate new_ld = ld.withYear(1999).withMonth(8).withDayOfYear(33);
		// 년을 1999로 월을 8으로 일을 년의 33일로 변경
		System.out.println(new_ld);		// 1999-02-02

	}

}
