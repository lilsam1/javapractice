package ch_06_method;

public class CallByValue_exam01 {
	/*
	 �޼��� ȣ�� ���
	 1. ���� ���� ȣ��
	 	���� ���� �޼��� ȣ�� ����� �޼��� ȣ�� �ÿ� ���� ����Ǿ� ����
	 	�޼����� �Ű����� Ÿ���� �⺻�� �������϶� ���� ���� ȣ���� ��
	 */
	
	/*
	 �޼��� increase() ȣ�� �� n�̶�� �Ű������� �޸𸮿� �����Ǿ�
	 var1�� ���� 100�� ���� �Ǿ� ó��
	 �޼��� ������ ����Ǹ� �Ű����� n�� �޸𸮿��� �Ҹ�
	 ��ó�� ���� ���� ȣ���� ȣ��� �Ű������� �����ϴ� ���� ����Ǿ� ����
	 ���� var1�� ���� ������ ����
	 */
	public int increase(int n) {
		++n;
		return n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int var1 = 100;
		CallByValue_exam01 val = new CallByValue_exam01();
		int result = val.increase(var1);
		System.out.println("var1: " + var1 + ", result: " + result);

	}

}
