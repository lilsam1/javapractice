package ch_17_java_util_package;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;

public class Time_ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* with() 메서드 : TemporalAdjusters 타입을 인자로 받으면 특정 날짜를 리턴
		 firstDayofYear() : 년도의 첫 번쨰 일
		 lastDayofYear() : 년도의 마지막 일
		 firstDayofMonth() : 달의 첫 번째 일
		 lastDayofYear() : 달의 마지막 일
		 firstInMonth(DayofWeek dayOfWeek) : 달의 첫 번쨰 요일
		 lastInMonth(DayofWeek dayOfWeek) : 달의 마지막 요일
		 next(DayOfWeek dayOfWeek) : 돌아오는 요일
		 nextOrSame(DayOfWeek dayOfWeek) : 오늘을 포함한 돌아오는 요일
		 previous(DayOfWeek dayOfWeek) : 지난 요일
		 previousOrSam(DayOfWeek dayOfWeek) : 오늘을 포함한 지난 요일
		*/
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);	// 2022-12-16T15:14:14.600902100
		LocalDateTime new_ldt;
		
		new_ldt = ldt.with(TemporalAdjusters.firstDayOfYear());	// 년도의 첫 번쨰 일
		System.out.println("올해의 첫 번째 날 : " + new_ldt);		// 2022-01-01T15:14:14.600902100
		new_ldt = ldt.with(TemporalAdjusters.lastDayOfYear());	// 년도의 마지막 일
		System.out.println("올해의 마지막 날 : " + new_ldt);			// 2022-12-31T15:14:14.600902100
		
		new_ldt = ldt.with(TemporalAdjusters.firstDayOfMonth());	// 달의 첫 번째 일
		System.out.println("이번 달의 첫 번째 날 : " + new_ldt);			// 2022-12-01T15:14:14.600902100
		new_ldt = ldt.with(TemporalAdjusters.lastDayOfMonth());		// 달의 마지막 일
		System.out.println("이번 달의 마지막 날 : " + new_ldt);			// 2022-12-31T15:14:14.600902100
		
		new_ldt = ldt.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));	// 달의 첫번쨰 요일
		System.out.println("이번 달의 첫 월요일 : " + new_ldt);						// 2022-12-05T15:19:57.488095800
		new_ldt = ldt.with(TemporalAdjusters.lastInMonth(DayOfWeek.SUNDAY));	// 달의 마지막 요일
		System.out.println("이번 달의 마지막 일요일 : " + new_ldt);					// 2022-12-25T15:19:57.488095800
		
		new_ldt = ldt.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));	// 돌아오는 요일
		System.out.println("돌아오는 금요일 : " + new_ldt);					// 2022-12-23T15:19:57.488095800
		new_ldt = ldt.with(TemporalAdjusters.nextOrSame(DayOfWeek.FRIDAY));	// 오늘을 포함한 돌아오는 요일
		System.out.println("오늘을 포함한 다음 금요일 : " + new_ldt);				// 2022-12-16T15:19:57.488095800
		
		new_ldt = ldt.with(TemporalAdjusters.previous(DayOfWeek.MONDAY));	// 지난 요일
		System.out.println("지난 월요일 : " + new_ldt);							// 2022-12-12T15:19:57.488095800
		new_ldt = ldt.with(TemporalAdjusters.previousOrSame(DayOfWeek.MONDAY));	// 오늘을 포함한 요일
		System.out.println("오늘을 포함한 지난 월요일 : " + new_ldt);					// 2022-12-12T15:19:57.488095800
		
		
		
	}

}
