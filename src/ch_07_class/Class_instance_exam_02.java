package ch_07_class;

class Area {
	static void manual() {	// static�� �����Ƿ� Ŭ���� �޼���
		System.out.println("���� ��� ������ �Լ� ���");
		System.out.println("triangle : �ﰢ�� ����");
		System.out.println("rectangle : �簢�� ����");
		System.out.println("�Դϴ�");
		System.out.println();
	}
	
	double triangle(int a, int b) {	// �ﰢ�� ���̸� ��ȯ�ϴ� �޼���
		return (double) a * b / 2;
	}
	
	int rectangle(int a, int b) {	// �簢�� ���̸� ��ȯ�ϴ� �޼���
		return a * b;
	}
}

public class Class_instance_exam_02 {
	/*
	Ŭ���� �޼���� ��ü�� �������� �ʾƵ� ȣ���� ����
	�ν��Ͻ� �޼���� ��ü�� �����ؾ߸� ȣ���� ����
	�ֳ��ϸ� �ν��Ͻ� �޼���� ��ü�� �����Ǿ�� �޸𸮻� ������ �����ϰ�
	Ŭ���� �޼���� Ŭ������ �޸𸮿� �ö� �� �����Ǳ� ����
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area.manual();			// Ŭ���� �޼��� ���� ����
//		Area.triangle(3, 5);	// ���� �߻�	// �ν��Ͻ� ������ ���� ���⿡ ����� �� ����. class Area���� static double triangle�� �ٲٸ� Ŭ���� �޼���� ���� ����
//		Area.rectangle(3, 5);	// ���� �߻�	// �ν��Ͻ� ������ ���� ���⿡ ����� �� ����. class Area���� static int rectangle�� �ٲٸ� Ŭ���� �޼��� ���� ����
		
		Area cal = new Area();
		cal.manual();
		System.out.println(cal.triangle(3, 5));		// �ν��Ͻ� ���� �� ��� �������� ��
		System.out.println(cal.rectangle(3, 4));	// �ν��Ͻ� ���� �� ��� �������� ��

	}

}
