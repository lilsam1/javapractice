package ch_17_java_util_package;

import java.util.Date;

public class Date_ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date today = new Date();	// �⺻ �����ڷ� Date �ν��Ͻ��� ����� ���
		System.out.println(today);
		
		long a = System.currentTimeMillis();
		Date today2 = new Date(a);	// long Ÿ���� �Ķ���ͷ� �޾� �ν��Ͻ� ���� �� ���
		System.out.println(today2);
	}

}
