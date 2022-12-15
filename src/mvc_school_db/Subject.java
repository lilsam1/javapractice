package mvc_school_db;

public class Subject {
	private String subjectName;
	private int code;
	
	public Subject() {
		
	}
	
	public Subject(int code, String subjectName) {
		this.code = code;
		this.subjectName = subjectName;
	}
	
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
}
