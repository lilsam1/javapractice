package ch_13_java.lang;

import java.util.ArrayList;

/*
 ������ ���׸��� ������ ���� �迭�� ArrayList�� Ÿ�� �μ����� ����غ���
 �ٸ� �ڷ����� ������ ���ڿ��� ���������� �� Object�� �ļ��̹Ƿ� ���忡�� ���� ����
 ������ ��Ҹ� ���� ���� ������ ĳ������ �ؾ� �� ���� 
 */


public class Generic_ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList arNum = new ArrayList();
		arNum.add(1);
		arNum.add("���ڿ�");
		int value = (int)arNum.get(0);
//		int temp = (int)arNum.get(1);	// ���ڿ��ε� ���������� ����ȯ�Ϸ��� ���� �߻�
		System.out.println(value);

	}

}
