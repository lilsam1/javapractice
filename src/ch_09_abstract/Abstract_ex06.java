package ch_09_abstract;

abstract class Student {
	public String name;	// 이름
	public int grade;	// 학년
	 String teacher;
	
	public Student() {
		System.out.println("Student 생성자 호출");
	}
	
	public String getName() {
		return name;
	}
	
	public int getGrade() {
		return grade;
	}
	public String getStudInfo() {
		System.out.println("Student 클래스의 getStudInfo() 메서드 호출");
		
		return "이름은 : " + name + " , 학년은 " + grade;
	}
	
	// 학생의 담임선생님의 이름을 구하는 메서드
	public abstract String getTeacher();
}
	

class Elementary extends Student {
	public Elementary(String name, int grade) {
		System.out.println("Elementary 생성자 호출");
		super.name=name;
		super.grade=grade;
	}
	
	// 추가
	public Elementary(String name, int grade, String teacher) {
		System.out.println("Elementary 생성자 호출");
		super.name=name;
		super.grade=grade;
		super.teacher= teacher;
	}
	
	public Elementary() {
		this("이순신", 3);
		System.out.println("Elementary 생성자 호출");
	}
	

	@Override
	// 초등학교 담임선생님을 구하는 메서드
	public String getTeacher() {
		// TODO Auto-generated method stub
		return "담당 선생님: " +  super.teacher;
	}
}

class University extends Student {
	private int courses;	// 신청 학생
	
	public University(String name, int grade, int course) {
		System.out.println("University 생성자 호출");
		super.name = name;
		super.grade = grade;
		this.courses = courses;
	}
	
//	추가
	public University(String name, int grade, int course, String teacher) {
		System.out.println("University 생성자 호출");
		super.name = name;
		super.grade = grade;
		this.courses = courses;
		super.teacher = teacher;
	}
	
	
	public University() {
		this("이순신",2,20);
	}
	
	public int getCourses() {
		return courses;
	}
	
	// overriding 메서드
	public String getStudInfo() {
		System.out.println("University 클래스의 getStudInfo 메서드 호출");
		return "이름은>> " + name + ", 학년은>> " + grade + ", 신청 학점은>> " + courses;
	}
	
	// 지도 교수의 이름을 구하는 메서드
	@Override
	public String getTeacher() {
		// TODO Auto-generated method stub
		return "담당 교수님:" + super.teacher;
	}
}

public class Abstract_ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 개발 관리자가 Student 상위 클래스를 만들면서 학생의 담당 선생이나 교수를 구하는 메서드
		 getTeacher()를 만들었고, 각 개발자에게 오버라이딩을 하라고 시킴
		 하지만 기존의 개발자가 교체되어 해당 프로젝트에 익숙하지 않은 경우
		 관리자의 지시를 잘못 이해해서 Elementary, University 클래스 제작시에
		 기능은 유사하지만 이름이 다른 메서드를 만들게 됨
		 이 후에 다른 개발자들이 만든 Student를 상속한 클래스와 통일성을 잃어버리게 됨
		 현재 프로그래밍 경향은 개발자가 각 기능을 알아서 구현하는 것 보다는
		 프로젝트의 규모가 점점 커지므로 향후 유지보수나 관리를 위해서는
		 누구나 쉽게 소스를 이해하고, 소스의 구조를 일정하게 유지해야 할 필요성이 있음
		 하지만 이런 방식으로 오버라이딩을 구현하면 개발자가 임의로 소스를 구현할 수 있기 때문에 통일성을 잃어버릴 수 있음
		 
		 해당 소스를 추상클래스를 도입해서 오버라이딩에 강제성을 부여할 것
		 객체 생성시 담당 교수나 선생을 입력하는 생성자를 추가할 것
		 */
		
		University university = new University ("홍길동",3,22,"차범근");
		Elementary elementary = new Elementary("이순신", 2 ,"홍명보");
		
		Student[] students = new Student[2];
		students[0] = university;
		students[1] = elementary;
		for (Student s : students) {
			System.out.println("학생 이름:" + s.getName());
			System.out.println(s.getTeacher());
			
		}
		/*
		 학생 이름:홍길동
		 담당 교수님:차범근
		 학생 이름:이순신
		 담당 선생님:홍명보
		 */

	}
}


