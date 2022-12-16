package mvc_school_db;

public class Course {
	private int num;
	private int studentNumber;
	private int code;
	private int score;
	
	public Course() {
		
	}
	
	public Course(int studentNumber, int code) {
		this.studentNumber = studentNumber;
		this.code = code;
	}
	
	public Course(int code) {
		this.code = code;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
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

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	
}
