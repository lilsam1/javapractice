package ch_07_class;

public class Singleton_exam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* �������� ���������ڰ� private���� ������ �ȵ�
		Singleton singleton1 = new Singleton();	// ������ ����
		Singleton singleton2 = new Singleton();	// ������ ����
		*/
		Singleton singleton1 = Singleton.getInstatnce();
		Singleton singleton2 = Singleton.getInstatnce();
		
		if(singleton1 == singleton2) {
			System.out.println("���� Singleton ��ü�Դϴ�");
		}
		else {
			System.out.println("�ٸ� Singleton ��ü�Դϴ�");
		}

	}

}
