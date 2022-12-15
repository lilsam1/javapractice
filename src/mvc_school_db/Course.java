package mvc_school_db;

public class Course {
	private String name;
	private int studentNumber;
	private int code;
	private int[] score;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public int[] getScore() {
		return score;
	}
	public void setScore(int index, int score) {
		this.score[index] = score;
	}
	
	// 학생이 듣고 있는 수업의 정보 (자바, 파이썬, C)
	private boolean[] classCheck = {false, false, false};	// 수강 신청 하면 true로 변경
	
	public boolean[] getClassCheck() {
		return classCheck;
	}

	public void setClassCheck(int index, boolean check) {
		this.classCheck[index] = check;
	}

}
