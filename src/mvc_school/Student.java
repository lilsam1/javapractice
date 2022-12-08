package mvc_school;

public class Student extends Person{
	private int studentNumber;	// 학번
	// 학생이 듣고 있는 수업의 정보 (자바, 파이썬, C)
	private boolean[] classCheck = {false, false, false};	// 수강 신청 하면 true로 변경
	private int[] classScore = {0,0,0};	// 각 과목 성적
	
	// Student의 생성자
	public Student(int studentNumber) {
		// 학번을 매개 변수로 받아 현재 학생의 학번을 설정
		this.studentNumber = studentNumber;
	}
	
	public boolean[] getClassCheck() {
		return classCheck;
	}

	public void setClassCheck(int index, boolean check) {
		this.classCheck[index] = check;
	}
	
	public int[] getClassScore() {
		return classScore;
	}

	public void setClassScore(int index, int score) {
		this.classScore[index] = score;
	}

	public int getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}




	
	
}
