package ch_07_class;

class Mystudent {	// �޼��� ���� Ŭ����
	String name;	// �̸�
	int grade;		// �г�
	int kor;		// ���� ����
	int eng;		// ���� ����
	int math;		// ���� ����
	
	void printStudent() {
		// ���� �ϳ��� �л� �� ���� ���� ������ ������ �� ����
		System.out.println(name + "�� " + grade + "�г��̰�, ���� ������ " + kor + "�� �Դϴ�");
	}
}

public class Class_exam04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mystudent student1 = new Mystudent();	// class�� �𵨷� �ϴ� ��ü ����
		// �Ϲ����� �����Ϳ� Ÿ���� �޶� ��ü��� ��
		// ���� �ϳ��� �л� �� ���� ���� ������ ������ �� ����
		student1.name = "��ö��";
		student1.grade = 2;
		student1.kor = 100;
		student1.eng = 90;
		student1.math = 88;
		
		Mystudent student2 = new Mystudent();	// class�� �𵨷� �ϴ� ��ü ����
		student2.name = "�ڿ���";
		student2.grade = 1;
		student2.kor = 90;
		student2.eng = 70;
		student2.math = 98;
		
		student1.printStudent();	// ��ö���� 2�г��̰�, ���� ������ 100�� �Դϴ�
		student2.printStudent();	// �ڿ����� 1�г��̰�, ���� ������ 90�� �Դϴ�
	}


}
