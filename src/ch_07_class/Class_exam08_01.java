package ch_07_class;

class Account {
	String name;
	String no;
	long balance;

}

public class Class_exam08_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �� ����� ������� �����͸� ����ϴ� ���α׷�
		// � ��� Ŭ������ ����ϴ��� �� �ڵ带 ������� class ����
		
		String chulsooAccountName = "ö��";		// ö���� ���¸���
		String chulsooAccountNo = "123456";		// ö���� ���¹�ȣ
		long chulsooAccountBalance = 1000;		// ö���� �����ܰ�
		
		String youngheeAccountName = "����";		// ������ ���¸���
		String youngheeAccountNo = "654321";	// ������ ���¹�ȣ
		long youngheeAccountBalance = 200;		// ������ �����ܰ�
		
		chulsooAccountBalance -= 200;			// ö���� 200���� ����
		youngheeAccountBalance += 100;			// ���� 100���� ����
		
		System.out.println("�� ö���� ����");
		System.out.println("  ���¸��� : " + chulsooAccountName);
		System.out.println("  ���¹�ȣ : " + chulsooAccountNo);
		System.out.println("  �����ܰ� : " + chulsooAccountBalance);
		System.out.println();
		
		System.out.println("�� ������ ����");
		System.out.println("  ���¸��� : " + youngheeAccountName);
		System.out.println("  ���¹�ȣ : " + youngheeAccountNo);
		System.out.println("  �����ܰ� : " + youngheeAccountBalance);

	}

}
