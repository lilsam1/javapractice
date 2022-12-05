package ch_07_class;

class Students {
	String name;
	private String rollno;
	int age;
	
	Students(String name, String rollno, int age) {
		this.name = name;
		this.rollno = rollno;
		this.age = age;
	}
	
	public String toString () {
		return "학생의 이름 : " + name + "\n" + "학생의 학번 : " + rollno + "\n" + "학생의 나이 : " + age + "\n" + "Students 객체가 생성되었습니다";	
	}
	
}

public class Ex_10 {
	/*
	 학생을 나타내는 클래스 Students를 만든다
	 학생은 이름(name)과 학번(rollno), 나이(age)를 가진다
	 학번은 private로 선언한다 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students students = new Students("Kim", "0001", 20);
		System.out.println(students);
		/*
		 학생의 이름 : Kim
		 학생의 학번 : 0001
		 학생의 나이 : 20
		 Students 객체가 생성되었습니다
		 */

	}

}
