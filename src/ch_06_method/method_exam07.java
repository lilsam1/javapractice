package ch_06_method;

public class method_exam07 {
	// ���� Ÿ���� �ִ� �޼���
	public int add(int a, int b) {
		int c = a + b;
		return c;
		// return ������ ��ġ�ϴ� �����ʹ� �ݵ�� �޼����� ���� Ÿ�԰� ��ġ�ؾ� ��
		// return 3.5;	// ���� Ÿ�԰� �ٸ� ���������� ��ȯ�ϸ� ���� �߻�
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 20;
		int result = 0;
		
		method_exam07 method = new method_exam07();
		result = method.add(num1, num2);
		
		System.out.println("�� ���� ���� " + result);	// �޼����� ��ȯ ���� �����ؼ� ���
		System.out.println("�� ���� ���� " + method.add(num1, num2));	// �޼����� ��ȯ ���� �ٷ� ���

	}

}
