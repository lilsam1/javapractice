package ch_12_ExceptionHandling;

public class Throw_ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� Ŭ������ �ν��Ͻ��� ������ ���� Ű���� throw�� �̿��ϸ� ���� ���ܸ� �߻���ų �� ����
		try {
			Exception e = new Exception("���� ����");	// ���� Ŭ������ �ν��Ͻ� ����. �����ڿ� ���ܹ��� ����
			throw e;	// ���ܸ� ����
		// 	throw new Exception("���� ����");	// ���� �� ���� �� �ٷ� �ٿ� �� �� �ִ�
		}
		catch (Exception e) {
			System.out.println("���� �߻�");
			System.out.println(e.getMessage());	// e.getMessage() : �����ڿ��� ������ ���� ���� ���
		}
	}
}
