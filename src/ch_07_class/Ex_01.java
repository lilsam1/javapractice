package ch_07_class;

public class Ex_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.name = "ȫ�浿";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		
		System.out.println("�̸�: " + s.name);
		System.out.println("����: " + s.getTotal());
		System.out.println("���: " + s.getAverage());
	}
}

	class Student {
		// ���� Ŭ������ �ϼ��ϱ�
		
		String name;	// �̸�
		int ban;		// ��
		int no;			// ��ȣ
		int kor;		// ���� ����
		int eng;		// ���� ����
		int math;		// ���� ����
		
		int getTotal() {
			return kor + eng + math;
		}
		float getAverage() {
			return (float)this.getTotal() / 3;
		}
}
	
