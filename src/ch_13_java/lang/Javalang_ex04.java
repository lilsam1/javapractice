package ch_13_java.lang;

class Student {
	int studentId;
	String studentName;
	
	public Student(int studentId, String StudentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}
	
	public String toString() {
		return studentId + ", " + studentName;
	}

	// equals() �޼��� ������. �й��� ������ ���� �л����� ������
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Student) {	// ������ Ŭ������ ��ü�̸�
			Student std = (Student)obj;	// Student Ŭ������ ����ȯ
			if(studentId == std.studentId)	// �� ��ü�� �й��� �Ű������� �Ѿ�� ��ü�� �й��� ������ true ��ȯ
				return true;
			else return false;
		}
		return false;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return studentId;
	}

	public String getStudentNum() {
		// TODO Auto-generated method stub
		return null;
	}	
}

public class Javalang_ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student studentLee = new Student(100, "�̻��");
		Student studentLee2 = studentLee;
		Student studentSang = new Student(100, "�̻��");
		// ������ �ּ��� �� �ν��Ͻ� ��
		if(studentLee == studentLee2)
			System.out.println("studentLee�� studentLee2�� �ּҴ� �����ϴ�");
		else
			System.out.println("studentLee�� studentLee2�� �ּҴ� �ٸ��ϴ�");
		// studentLee�� studentLee2�� �ּҴ� �����ϴ�
		
		if(studentLee.equals(studentLee2))
			System.out.println("studentLee�� studentLee2�� �����մϴ�");
		else
			System.out.println("studentLee�� studentLee2�� �������� �ʽ��ϴ�");
		// studentLee�� studentLee2�� �����մϴ�
		
		/* ������������ �ν��Ͻ��� �ּҰ� �ٸ� ��� */
		// �ּҴ� �ٸ����� equals�� ����� true�� ���
		if(studentLee == studentSang)
			System.out.println("studentLee�� studentSang�� �ּҴ� �����ϴ�");
		else
			System.out.println("studentLee�� studentSang�� �ּҴ� �ٸ��ϴ�");
		// studentLee�� studentSang�� �ּҴ� �ٸ��ϴ�
		if(studentLee.equals(studentSang))
			System.out.println("studentLee�� studentSang�� �����մϴ�");
		else
			System.out.println("studentLee�� studentSang�� �������� �ʽ��ϴ�");
		// studentLee�� studentSang�� �����մϴ�
		
		System.out.println("studentLee�� hashCode :" + studentLee.hashCode());	// studentLee�� hashCode :100
		System.out.println("studentSang�� hashCode :" + studentSang.hashCode());	// studentSang�� hashCode :100
		
		System.out.println("studentLee�� ���� �ּҰ� :" + System.identityHashCode(studentLee));		// studentLee�� ���� �ּҰ� :474675244
		System.out.println("studentSang�� ���� �ּҰ� :" + System.identityHashCode(studentSang));	// studentSang�� ���� �ּҰ� :932583850

	}

}