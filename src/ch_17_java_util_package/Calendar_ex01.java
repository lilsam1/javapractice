package ch_17_java_util_package;

import java.util.Calendar;
import java.util.GregorianCalendar;

/* java.util.Calendar: ��¥�� �ٷ�� Ŭ����
 Calendar�� �߻� Ŭ�����̱� ������ ���� ��ü�� �������� ���ϰ�
 getIsntacne() �޼��带 ���� GregorianCalendar �ν��Ͻ��� �����ؾ���
 �� ����� �̱��� ���� �̶�� �ϴµ� �̱��� ������ ��ü�� ����� �� �ϳ��� �ν��Ͻ����� ������ ����ϴ� ���
 Calendar Ŭ������ �̱��� �������� ������� ��ǥ���� Ŭ������
 
 �̱��� ������ ������� �ʴ� ������δ� ���� GregorianCalendar �ν��Ͻ��� ����
*/

public class Calendar_ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar a = Calendar.getInstance();	// �̱��� ����
		Calendar b = new GregorianCalendar();	// GregorianCalendar �ν��Ͻ� ����
		
		// ������ ��� ���� ����
		System.out.println(a.toString());
		System.out.println(b.toString());
	}

}
