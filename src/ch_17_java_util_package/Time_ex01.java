package ch_17_java_util_package;

import java.time.LocalDateTime;

public class Time_ex01 {
	
	/* java.time 패키지
	 나중에 추가된 패키지. 기존의 Date와 Calendar를 보완
	 
	 java.time : 날짜와 시간을 나타내는 LocalDate, LocalTime 등을 포함한 패키지
	 java.time.format : 날짜와 시간을 파싱하고 포멧팅하는 API 포함
	 java.time.chrono : 여러가지 달력 시스템을 사용할 수 있는 API 포함
	 java.time.temporal : 날짜와 시간을 연산하기 위한 API 포함
	 java.time.zone : 타임존을 지원하는 API 포함
	 
	 java.time 패키지에서 날짜와 시간을 변경할 수 있음
	 클래스들은 immutable (불변한) 속성이 있기 떄문에 날짜나 시간을 변경하게 되면
	 실제로는 변경하는 것이 아니라 새로운 객체를 반환
	*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 시간를 더하고 빼는 메서드를 확인하는 코드
		// minusHours(long) 시간 뺴기, minusMinutes(long) 분 뺴기, minusSeconds(long) 초 빼기, minusNanos(long) 나노초 빼기
		// plusHours(long) 시간 더하기, plusMinutes(long) 분 더하기, plusSeconds(long) 초 더하기, plusNanos(long) 나노초 더하기
		
		LocalDateTime localDateTime = LocalDateTime.now();	// 현재 시간
		System.out.println("현재 시간 : " + localDateTime);	// 현재 시간 : 2022-12-16T14:12:43.742071300
		
		// 5시간을 뺴고 30분을 더하고 4초를 뺌
		LocalDateTime localDateTime1 = localDateTime.minusHours(5).plusMinutes(30).minusSeconds(4);
		System.out.println("변경 시간 : " + localDateTime1);	// 변경 시간 : 2022-12-16T09:42:39.742071300
		
		// ld2 값에서 24시간을 뺌
		LocalDateTime localDateTime2 = localDateTime1.minusHours(24);
		System.out.println("자동 변경 시간 : " + localDateTime2);	// 자동 변경 시간 : 2022-12-15T09:42:39.742071300


	}

}
