package ch_12_ExceptionHandling;

public class TryCatch_ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 10;
		int num2 = 0;
		
		try {
			System.out.println("** �������� 0���� ������ ���� **");
			// �������� ���� ����
			System.out.println("10/0=" + (num / num2));
			System.out.println("** �������� 0���� ������ ���� �Ϸ� **");
		} catch(Exception e) {	// Exception Ŭ���� e ��ü
			System.out.println(e);
			System.out.println("0���� ���� �� �����ϴ�");
		}
		System.out.println("���α׷��� ���� �����մϴ�");
	}

}
