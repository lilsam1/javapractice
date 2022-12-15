package mvc_school_db;

public class Student {
	private String name;		// �̸�
	private String phoneNumber;	// ��ȭ ��ȣ
	private String memo;		// �޸�
	private int studentNumber;	// �й�
	
	// Student�� ������
	public Student() {
		
	}
	
	public Student(int studentNumber) {
		// �й��� �Ű� ������ �޾� ���� �л��� �й��� ����
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




	
	
	// �л��� ��� �ִ� ������ ���� (�ڹ�, ���̽�, C)
	private boolean[] classCheck = {false, false, false};	// ���� ��û �ϸ� true�� ����
	private int[] classScore = {0,0,0};	// �� ���� ����
	
	
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
