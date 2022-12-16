/*
 Calendar 클래스를 사용해서 현재 시간이 나오도록 구현
 
 실행 결과 :
 2022년 8월 22일
 월요일 오후
 5시 54분 38초 
 
 */

package ch_17_java_util_package;

import java.util.Calendar;

public class ex_01 {
	public static String strWeek(int day) {
		String[] days = {"일", "월", "화", "수", "목", "금", "토"};
		return days[day - 1];
	}
	
	public static String strAmPm(int a) {
		String[] ampm = {"오전", "오후"};
		return ampm[a - 1];
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;
		int day = now.get(Calendar.DAY_OF_MONTH);
		int hour = now.get(Calendar.HOUR) + 1;
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		int amPm = now.get(Calendar.AM_PM);
		if (amPm == Calendar.AM) {
			strAmPm(Calendar.AM_PM);
		} else {
			strAmPm(Calendar.AM_PM);
		}
		
		System.out.print(year + "년");
		System.out.print(month + "월");
		System.out.println(day + "일");
		System.out.print(strWeek(Calendar.DAY_OF_WEEK));
		System.out.println(strAmPm(Calendar.AM_PM));
		System.out.print(hour + "시");
		System.out.print(minute + "분");
		System.out.println(second + "초");
		
		
		

	}

}
