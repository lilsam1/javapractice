package ch_06_method;

public class method_exam06 {
	// �Ű� ������ 2�� ����ϴ� �޼���
	public void print(int a, int b) {
		int c = a + b;
		System.out.println("�����: " + c);
	}
	
	// �Ű� ������ ���ڿ��� �޴� �޼��� ����
	public void print1(String str) {
		System.out.println(str);
	}

	public static void main(String[] args) {
		// ���� ����
		int num1 = 11;
		int num2 = 22;
		int result = 0;
		
		// ����� �޼��尡 �ִ� Ŭ������ �ν��Ͻ� ����
		method_exam06 method = new method_exam06();
		
		// �޼��� ȣ��
		method.print(10, 20);
//		method.print(10, 30.0f);	����ȵ�. ������Ÿ�� �޶�
		method.print1("�ȳ��ϼ���");

	}

}
