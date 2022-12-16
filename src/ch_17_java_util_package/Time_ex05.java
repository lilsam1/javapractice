package ch_17_java_util_package;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;

public class Time_ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* with() �޼��� : TemporalAdjusters Ÿ���� ���ڷ� ������ Ư�� ��¥�� ����
		 firstDayofYear() : �⵵�� ù ���� ��
		 lastDayofYear() : �⵵�� ������ ��
		 firstDayofMonth() : ���� ù ��° ��
		 lastDayofYear() : ���� ������ ��
		 firstInMonth(DayofWeek dayOfWeek) : ���� ù ���� ����
		 lastInMonth(DayofWeek dayOfWeek) : ���� ������ ����
		 next(DayOfWeek dayOfWeek) : ���ƿ��� ����
		 nextOrSame(DayOfWeek dayOfWeek) : ������ ������ ���ƿ��� ����
		 previous(DayOfWeek dayOfWeek) : ���� ����
		 previousOrSam(DayOfWeek dayOfWeek) : ������ ������ ���� ����
		*/
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);	// 2022-12-16T15:14:14.600902100
		LocalDateTime new_ldt;
		
		new_ldt = ldt.with(TemporalAdjusters.firstDayOfYear());	// �⵵�� ù ���� ��
		System.out.println("������ ù ��° �� : " + new_ldt);		// 2022-01-01T15:14:14.600902100
		new_ldt = ldt.with(TemporalAdjusters.lastDayOfYear());	// �⵵�� ������ ��
		System.out.println("������ ������ �� : " + new_ldt);			// 2022-12-31T15:14:14.600902100
		
		new_ldt = ldt.with(TemporalAdjusters.firstDayOfMonth());	// ���� ù ��° ��
		System.out.println("�̹� ���� ù ��° �� : " + new_ldt);			// 2022-12-01T15:14:14.600902100
		new_ldt = ldt.with(TemporalAdjusters.lastDayOfMonth());		// ���� ������ ��
		System.out.println("�̹� ���� ������ �� : " + new_ldt);			// 2022-12-31T15:14:14.600902100
		
		new_ldt = ldt.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));	// ���� ù���� ����
		System.out.println("�̹� ���� ù ������ : " + new_ldt);						// 2022-12-05T15:19:57.488095800
		new_ldt = ldt.with(TemporalAdjusters.lastInMonth(DayOfWeek.SUNDAY));	// ���� ������ ����
		System.out.println("�̹� ���� ������ �Ͽ��� : " + new_ldt);					// 2022-12-25T15:19:57.488095800
		
		new_ldt = ldt.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));	// ���ƿ��� ����
		System.out.println("���ƿ��� �ݿ��� : " + new_ldt);					// 2022-12-23T15:19:57.488095800
		new_ldt = ldt.with(TemporalAdjusters.nextOrSame(DayOfWeek.FRIDAY));	// ������ ������ ���ƿ��� ����
		System.out.println("������ ������ ���� �ݿ��� : " + new_ldt);				// 2022-12-16T15:19:57.488095800
		
		new_ldt = ldt.with(TemporalAdjusters.previous(DayOfWeek.MONDAY));	// ���� ����
		System.out.println("���� ������ : " + new_ldt);							// 2022-12-12T15:19:57.488095800
		new_ldt = ldt.with(TemporalAdjusters.previousOrSame(DayOfWeek.MONDAY));	// ������ ������ ����
		System.out.println("������ ������ ���� ������ : " + new_ldt);					// 2022-12-12T15:19:57.488095800
		
		
		
	}

}
