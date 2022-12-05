package ch_11_innerClass;

class OutClass1 {
	/* ���� ���� Ŭ���� static inner class
	 ���� Ŭ������ �ܺ� Ŭ������ ������ �����ϰ� ����� �� �־�� �ϰ�, ���� ������ ����� �� �־�� �� �� ���
	 �ν��Ͻ� ���� Ŭ����ó�� �ܺ� Ŭ���� ����� ���� ��ġ�� �����Ͽ� static ���� �Բ� ���
	 */
	private int num = 10;
	private static int sNum = 20;
	
	static class InsstaticClass {	// static ���� Ŭ����
		int inNum = 100;
		static int sInNum = 200;
		
		void inTest() {	// ���� Ŭ������ �Ϲ� �޼���
			// num += 10;	// �ܺ� Ŭ������ �ν��Ͻ� ������ ����� �� ����
			// �ܺ� Ŭ���� ��ü�� �������� �ʰ� �ٷ� ���� ���� Ŭ������ ��ü ������ �� �־ �ܺ� Ŭ������ �ν��Ͻ� ���� ����� ����
			System.out.println("InStaticClass inNum = " + inNum + "(���� Ŭ������ �ν��Ͻ� ���� ���)");
			System.out.println("InStaticClass sInNum = " + sInNum + "(���� Ŭ������ ����ƽ ���� ���)");
			System.out.println("OutClass sNum = " + sNum + "(�ܺ� Ŭ������ ����ƽ ���� ���)");
		}
		
		static void sTest() {	// ���� Ŭ������ static �޼���
//			 num += 10;	// �ܺ� Ŭ������ �ν��Ͻ� ������ ����� �� ����
			// inNum += 10;	// ���� Ŭ������ �ν��Ͻ� ������ ����� �� ����
			
			System.out.println("OutClass sNum = " + sNum + "(�ܺ� Ŭ������ ����ƽ ���� ���)");
			System.out.println("InStaticClass sInNum = " + sInNum + "(���� Ŭ������ ����ƽ ���� ���)");
		}
	}
}

public class InnerClass_ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �ܺ� Ŭ���� ��ü �������� �ʰ� �ٷ� ���� ���� Ŭ������ ��ü ����
		OutClass1.InsstaticClass sInClass = new OutClass1.InsstaticClass();
		System.out.println("���� ���� Ŭ���� �Ϲ� �޼��� ȣ��");
		sInClass.inTest();
		System.out.println();
		
		System.out.println("���� ���� Ŭ������ ����ƽ �޼��� ȣ��");
		OutClass1.InsstaticClass.sTest();

	}

}
