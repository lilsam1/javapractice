package ch_07_ex_student;

public class Student {
	int studentID;		// �й�
	String studentName;	// �̸�
	int grade;			// �г�
	String address;		// �ּ�
	
	public void showstudentInfo() {				// ����� �̸�, �ּҸ� �˷���
		System.out.println(studentName + "," + address);// �̸�, �ּ�
	}
	
	public String getStudentName() {			// studentName�� ��ȯ
		return studentName;
	}
	
	public void setStudentName(String name) {	// studentName�� ����
		studentName = name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
