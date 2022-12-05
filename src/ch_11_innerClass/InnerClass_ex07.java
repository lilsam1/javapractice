package ch_11_innerClass;

/* ���� ���� Ŭ����
 �ܺ� Ŭ������ �޼��� ������ ���ǵ� Ŭ����
 �޼��� ȣ�� �ÿ� �����ǰ� �����ϸ� �Ҹ�
 
 �޼����� ���� ������ ���ø޸𸮿��� ����ǹǷ� ȣ�� �� �����ϸ� �Ҹ�
 ������ ���� ���� Ŭ������ ��ü�� ������ ������ �ǹǷ� �޼��� ȣ���� ������ �����ϴ��� �������
 
 ���� ���� Ŭ������ ���α׷��ֿ��� ���� ������� ����. �̷� ���� Ŭ������ �ִٴ� ������ �˾Ƶδ� ����
 */
class OutClass2 {
	// Runnalbe �������̽��� �����ϴ� Ŭ������ ���� ���� Ŭ������ ���� ����
	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRunnable(int i) {	// ��ȯ���� Runnable�� �޼���
		int num = 100;
		// Runnalbe �������̽��� �ڹٿ��� �����带 ���� �� ����ϴ� �������̽�
		// java.lang ��Ű���� ����Ǿ� ������ �ݵ�� run() �޼��带 �����ؾ� ��
		class MyRunnable implements Runnable{
			int localNum = 10;

			@Override
			public void run() {
				// ���� ���� Ŭ������ ����� �޼����� ���������� ������� ����
//				num = 200;	// ����. ���������� ����� �ٲ�. ���� ���� �������� ���� ���� ����
//				i = 100;	// ����. �Ű� ���� ���� ��������ó�� ����� �ٲ�. ���� ���� �������� ���� ���� ����
				System.out.println("i = " + i);	// ���� ���� ���ص� ���� ���� ����
				System.out.println("num = " + num);	// ���� ���� ���ص� ���� ���� ����
				System.out.println("localNum = " + localNum);
				
				System.out.println("outNum = " + outNum + "(�ܺ� Ŭ���� �ν��Ͻ� ����)");
				System.out.println("Outter.sNum = " + OutClass2.sNum + "(�ܺ� Ŭ���� ���� ����)");	
			}
		}
		return new MyRunnable();
	}
}

public class InnerClass_ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OutClass2 out = new OutClass2();
		Runnable runner = out.getRunnable(10);
		runner.run();
	}
}
