package ch_06_method;

public class method_exam10 {
	/*	���� ���� ����
	 ���� ���� ���ڴ� �޼��� ȣ�� �� �ڵ����� �迭�� �����ǰ� �迭�� ���ڰ����� ������ �� �迭�� ó���ϴ� ��
	 �ڵ����� �����Ǵ� �迭�� Ÿ���� ����� Ÿ������ �����Ǹ� �迭�� ũ��� ������ ������ ����
	 ������ Ÿ�� ������ ���� �� �� �� ����
	 */
	static void test(int... v) {
		System.out.print(v.length + " : ");
		for(int x : v) {
			System.out.print(x + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test(1);
		test(1, 2);
		test(1, 2, 3);


	}

}
