package ch_17_java_util_package;

import java.util.Calendar;

public class Calendar_ex02 {
	// get() �޼���� ���� ��������
	public static String getDayToStr(int day) {
		String[] days = {"��", "��", "ȭ", "��", "��", "��", "��"};
		return days[day - 1];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar calendar = Calendar.getInstance();
		
		// Calendar Ŭ�������� �����͸� �������� get() �޼��带 ���
		// get() �޼����� ��ȯŸ���� int�̸� ������ ���� ��(MONTH) ��ȯ�� ���� ������ 1�� ���� ���� ��ȯ
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH) + 1;	// ���� �� ���� 1���� ���� ��ȯ�Ǽ� 1�� ���� ���� 
		int date = calendar.get(Calendar.DATE);
		
		System.out.println(year + "��" + month + "��" + date + "��");	// ���� ��¥ ��ȯ
		System.out.println(calendar.get(Calendar.DAY_OF_WEEK));	// ������ ��ȯ�ϴµ� , ��ȯŸ���� ����
		// 1 = �Ͽ���, 2= ������, 7= �����
		System.out.println("������ " + getDayToStr(Calendar.DAY_OF_WEEK) + "�����Դϴ�");
		System.out.print("�̹� �⵵���� ������ �� ��°�ΰ�? : ");
		System.out.println(calendar.get(Calendar.DAY_OF_WEEK));	// �̹� �⵵�� ��ĥ����
		
		System.out.print("�̹� ���� ��ĥ���� �ִ°�? : ");
		System.out.println(calendar.getActualMaximum(Calendar.DATE));

	}

}
