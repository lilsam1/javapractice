package mvc_school_db;

public class Student {
	private String name;		// 이름
	private String phoneNumber;	// 전화 번호
	private String memo;		// 메모
	private int studentNumber;	// 학번
	
	// Student의 생성자
	public Student() {
		
	}
	
	public Student(int studentNumber) {
		// 학번을 매개 변수로 받아 현재 학생의 학번을 설정
		this.studentNumber = studentNumber;
	}
	
	public Student(String name, String phoneNumber, String memo, int studentNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.memo = memo;
		this.studentNumber = studentNumber;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public int getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}




	
	
	// 학생이 듣고 있는 수업의 정보 (자바, 파이썬, C)
	private boolean[] classCheck = {false, false, false};	// 수강 신청 하면 true로 변경
	private int[] classScore = {0,0,0};	// 각 과목 성적
	
	
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

	
}
