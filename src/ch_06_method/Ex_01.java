package ch_06_method;

public class Ex_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
		a = 10;
		b = 20;
		c = 30;
		System.out.println(a + ", " + b + ", " + c + " �߿� ���� ū ���� " + max(a, b, c)+ "�Դϴ�.");
		System.out.println(a+ ", " + b + " �߿� ���� ū ���� " + max(a, b) + "�Դϴ�.");
	}
	static int max(int a, int b, int c) {	// a, b, c�� �ִ밪�� ��ȯ
		int max = a;
		if (max < b) max = b;
		if (max < c) max = c;
		return max;
	}
	static int max(int a, int b) {	//a, b�� �ִ밪�� ��ȯ
		int max = a;
		if (a < b) max = b;
		return max;
	}

}