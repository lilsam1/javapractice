package ch_07_class;

class MyMath {
	
	
	int add(int a, int b) {
		return a + b;
	}
	int subtract(int a, int b) {
		return a - b;
	}
	int multiply(int a, int b) {
		return a * b;
	}
	double divide(double a, double b) {
		return a / b;
	}
}

public class Ex_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyMath mm = new MyMath();
		int result1 = mm.add(5,3);
		int result2 = mm.subtract(5,3);
		int result3 = mm.multiply(5,3);
		double result4 = mm.divide(5,3);
		
		// double ��� int ������ ȣ��. �� ���� �ڵ����� double�� �ڵ� ����ȯ
		System.out.println("add(5,3) = " + result1);
		System.out.println("subtract(5,3) = " + result2);
		System.out.println("multiply(5,3) = " + result3);
		System.out.println("divide(5,3) = " + result4);

	}

}
