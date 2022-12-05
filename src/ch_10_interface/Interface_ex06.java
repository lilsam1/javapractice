package ch_10_interface;

/* ���� ���̽��� ����
 �ڹ� 7������ �������̽����� �߻�޼���� ��� , �� ���� ��Ҹ� �����ؼ� ����� �� ����
 ���� Ŭ������ ���� ����� �����ϴ� ��쿡�� �߻� �޼��带 �����ϰ� �� Ŭ�������� �Ȱ��� �ڵ带 �־� �����ؾ���
 
 �ڹ� 8���ʹ� �������̽� Ȱ�뼺�� ���̱� ���� ����Ʈ �޼���� ���� �޼��� ����� ����
 -����Ʈ �޼���� �������̽����� ���� �ڵ���� �ۼ��� �޼���� �������̽��� ������ Ŭ������ �⺻������ ����
  �������̽����� ����������, ���� �������̽��� ������ Ŭ������ �����Ǹ� �� Ŭ�������� ���
 -���� �޼���� �ν��Ͻ� ������ ������� ����� �� �ִ� �޼���. ����� ���� �������̽� �̸����� ���� �����Ͽ� ���
 
 
 �ڹ� 9���ʹ� �������̽��� private �޼��带 ������ �� ����
 private �޼���� �������̽��� ������ Ŭ�������� ����ϰų� �������� �� ����
 ���� ������ ������ �ڵ带 �������� �ʰ� �������̽��� ������ Ŭ�������� �������� ����ϴ� ��� private �޼��带 ����ϸ� �ڵ� ���뼺�� ���� �� ����
 ���� Ŭ���̾�Ʈ ���α׷��� ������ �⺻ ����� private �޼���� �����ϱ⵵ ��
 */

interface Calc {	// �������̽� �����
	// �������̽����� ����� ������ ������ �������� ����� ��ȯ��
	double PI = 3.14;
	int ERROR = -999999999;
	
	// �������̽����� ������ �޼���� ������ �������� �߻�޼���� ��ȯ��
	int add(int num1, int num2);
	int substact(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	// �������̽��� ����Ʈ �޼��� ����
	default void description() {
		System.out.println("���� ���⸦ �����մϴ�");
		myMethod();
	}
	
	// ���� �޼��� ����
	static int total(int[] arr) {
		int total = 0;
		
		for(int i : arr) {
			total += i;
		}
		myStaticMethod();
		return total;
	}
	
	private void myMethod() {	// ����Ʈ �޼��忡�� ���
		System.out.println("private �޼����Դϴ�");
	}
	
	// private �޼���� �ڵ带 ��� �����ؾ� �ϹǷ� �߻�޼��忡�� private ���� ����� �� ����
	// static ������ �Բ� ��� ����
	private static void myStaticMethod() {	// ���� �޼��忡�� ���
		System.out.println("private static �޼����Դϴ�");
	}
}

abstract class Calculator implements Calc {
	// �������̽��� ������ �߻�Ŭ����
	// �߻�Ŭ������ ��� �������̽��� ��� �߻� �޼��带 �������� �ʾƵ� ��

	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int substact(int num1, int num2) {
		return num1 - num2;
	}
}

class CompleteCalc extends Calculator {
	// �������̽��� ������ �߻�Ŭ������ ��ӹ��� �Ϲ� Ŭ����
	// �߻�Ŭ�������� add(), substact()�� ���������� times(), divide()�� �����ϸ� ��

	@Override
	public int times(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		if(num2 != 0)
			return num1 / num2;
		else
			return Calc.ERROR;	// � ���� 0���� ������ ��쿡 ������ ��ȯ
	}
	
	public void showInfo() {	// CompleteCalc���� �߰��� ������ �޼���
		System.out.println("Calc �������̽��� �����Ͽ����ϴ�");
	}
}

public class Interface_ex06 {
	/*
	 �������̽� interface�� Ŭ���� Ȥ�� ���α׷��� �����ϴ� ����� ��������� �����ϴ� ����
	 �������̽��� �߻�޼���� ����θ� �̷����
	 ������ �ڵ尡 ���� ������ �翬�� �������̽��� �ν��Ͻ��� ������ �� ����
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 5;
		
		CompleteCalc calc = new CompleteCalc();
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.substact(num1, num2));
		System.out.println(calc.times(num1, num2));
		System.out.println(calc.divide(num1, num2));
		calc.showInfo();
		calc.description();
		
		int[] arr = {1,2,3,4,5};
//		System.out.println(calc.total(arr));
	}
}
