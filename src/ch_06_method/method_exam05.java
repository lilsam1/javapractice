package ch_06_method;

public class method_exam05 {
	
	/*
	 �Ű� ������ �ִ� �޼���
	 �Ű� ������ �޼��� ȣ��� �޸𸮿� �����ǰ� ȣ�� �� ���� �� �Ҹ�
	 */
	public void print(int a) {
		System.out.println("�����: " + a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 11;
		int b = 22;
		int result = 0;
		
		// ����� �޼��尡 �ִ� Ŭ������ �ν��Ͻ� ����
		method_exam05 method = new method_exam05();
		method.print(10);
		method.print(b);
		method.print(result);

	}

}
