package ch_09_abstract;

abstract class Calculator {
	int num1, num2;
	abstract int calc();
	
	void printResult() {
		System.out.println("calc() ������ ����� " + calc() + "�Դϴ�");
	}
}

class MyCalculator extends Calculator {
	int calc() {
		return this.num1 + this.num2;
	}

}
/*
������ �ʵ� num1, num2�� �ִ�
num1, num2�� ����Ͽ� Ư�� ����� �����ϴ� int calc() �޼��带 �߻� �޼���� �����Ѵ�
void printResult() �޼����
�Ϲ� �޼���� calc() �޼��� ���� ��� ������ �޾� ����ϵ��� �̸� �����Ѵ�

1. �� �䱸 ������ �����ϴ� �߻� Ŭ���� Calculator �ۼ�
2. Calculator �߻� Ŭ������ ��ӹ޴� MyCalculator Ŭ������ ����
*/
public class Abstract_ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCalculator myCalculator = new MyCalculator();
		myCalculator.num1 = 10;
		myCalculator.num2 = 20;
		myCalculator.printResult();	// calc() ������ ����� 30�Դϴ�

	}

}
