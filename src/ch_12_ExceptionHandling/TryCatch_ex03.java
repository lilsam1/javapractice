package ch_12_ExceptionHandling;

public class TryCatch_ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		int b = 2;
		try {
			System.out.println("�ܺη� ����");
			int c = b / a;
		}
		catch(ArithmeticException e) {
			System.out.println("������ �߻��߽��ϴ�");
		}
		finally {
			System.out.println("���� ����");
		}
		System.out.println("���⵵ ����˴ϴ�");

	}

}
