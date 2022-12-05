package ch_07_ex_student;

public class Student {
	int studentID;		// 학번
	String studentName;	// 이름
	int grade;			// 학년
	String address;		// 주소
	
	public void showstudentInfo() {				// 저장된 이름, 주소를 알려줌
		System.out.println(studentName + "," + address);// 이름, 주소
	}
	
	public String getStudentName() {			// studentName을 반환
		return studentName;
	}
	
	public void setStudentName(String name) {	// studentName을 저장
		studentName = name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
