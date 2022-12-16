package ch_17_java_util_package;

import java.time.LocalDateTime;

public class Time_ex01 {
	
	/* java.time ��Ű��
	 ���߿� �߰��� ��Ű��. ������ Date�� Calendar�� ����
	 
	 java.time : ��¥�� �ð��� ��Ÿ���� LocalDate, LocalTime ���� ������ ��Ű��
	 java.time.format : ��¥�� �ð��� �Ľ��ϰ� �������ϴ� API ����
	 java.time.chrono : �������� �޷� �ý����� ����� �� �ִ� API ����
	 java.time.temporal : ��¥�� �ð��� �����ϱ� ���� API ����
	 java.time.zone : Ÿ������ �����ϴ� API ����
	 
	 java.time ��Ű������ ��¥�� �ð��� ������ �� ����
	 Ŭ�������� immutable (�Һ���) �Ӽ��� �ֱ� ������ ��¥�� �ð��� �����ϰ� �Ǹ�
	 �����δ� �����ϴ� ���� �ƴ϶� ���ο� ��ü�� ��ȯ
	*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// �ð��� ���ϰ� ���� �޼��带 Ȯ���ϴ� �ڵ�
		// minusHours(long) �ð� ����, minusMinutes(long) �� ����, minusSeconds(long) �� ����, minusNanos(long) ������ ����
		// plusHours(long) �ð� ���ϱ�, plusMinutes(long) �� ���ϱ�, plusSeconds(long) �� ���ϱ�, plusNanos(long) ������ ���ϱ�
		
		LocalDateTime localDateTime = LocalDateTime.now();	// ���� �ð�
		System.out.println("���� �ð� : " + localDateTime);	// ���� �ð� : 2022-12-16T14:12:43.742071300
		
		// 5�ð��� ���� 30���� ���ϰ� 4�ʸ� ��
		LocalDateTime localDateTime1 = localDateTime.minusHours(5).plusMinutes(30).minusSeconds(4);
		System.out.println("���� �ð� : " + localDateTime1);	// ���� �ð� : 2022-12-16T09:42:39.742071300
		
		// ld2 ������ 24�ð��� ��
		LocalDateTime localDateTime2 = localDateTime1.minusHours(24);
		System.out.println("�ڵ� ���� �ð� : " + localDateTime2);	// �ڵ� ���� �ð� : 2022-12-15T09:42:39.742071300


	}

}
