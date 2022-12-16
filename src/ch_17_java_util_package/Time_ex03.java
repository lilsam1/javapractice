package ch_17_java_util_package;

import java.time.LocalDate;

public class Time_ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Ŭ�������� ���� �� ����
		 �� Ŭ�������� �ʵ� ������ Ư�� ������ ������ �� �ִ� �޼��尡 ����
		 whitYear(int) �� ����, withMont(int) �� ����, withDayofYear(int) ���� �� ����, withDayofMont(int) ���� �� ����
		*/
		
		// ��¥�� �����ϴ� �ڵ�
		LocalDate ld = LocalDate.now();
		System.out.println(ld);			// 2022-12-16
		
		LocalDate new_ld = ld.withYear(1999).withMonth(8).withDayOfYear(33);
		// ���� 1999�� ���� 8���� ���� ���� 33�Ϸ� ����
		System.out.println(new_ld);		// 1999-02-02

	}

}
