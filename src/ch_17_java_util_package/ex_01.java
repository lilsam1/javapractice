/*
 Calendar Ŭ������ ����ؼ� ���� �ð��� �������� ����
 
 ���� ��� :
 2022�� 8�� 22��
 ������ ����
 5�� 54�� 38�� 
 
 */

package ch_17_java_util_package;

import java.util.Calendar;

public class ex_01 {
	public static String strWeek(int day) {
		String[] days = {"��", "��", "ȭ", "��", "��", "��", "��"};
		return days[day - 1];
	}
	
	public static String strAmPm(int a) {
		String[] ampm = {"����", "����"};
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
		
		System.out.print(year + "��");
		System.out.print(month + "��");
		System.out.println(day + "��");
		System.out.print(strWeek(Calendar.DAY_OF_WEEK));
		System.out.println(strAmPm(Calendar.AM_PM));
		System.out.print(hour + "��");
		System.out.print(minute + "��");
		System.out.println(second + "��");
		
		
		

	}

}
