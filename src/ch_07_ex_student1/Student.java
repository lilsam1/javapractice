package ch_07_ex_student1;

import java.util.Scanner;

public class Student {
	/*
	 Student 클래스를 생성하시오
	 이름 name, 반 ban, 번호 no 를 입력받는 생성자를 만드시오
	 국어 kor, 영어 eng, 수학 math 성적을 입력받는 updateRecord() 메서드를 작성하시오
	 학생의 이름을 반환하는 getName(), 입력받은 성적의 합계를 구하는 getTotal(), 평균을 반환하는 getAverage()를 작성하시오
	 */
	
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;


	Student(String name, int ban, int no) {
		this.name = name;
		this.ban = ban;
		this.no = no;
	}
	
	void updateRecord(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	int getTotal() {
		return kor + eng + math;
	}

	double getAverage() {
		return (kor + eng + math)/3.0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student("홍길동", 1, 1);
		s.updateRecord(100, 60, 76);
		System.out.println(s);
		
		
		System.out.println("이름: " + s.getName());
		System.out.println("총점: " + s.getTotal());
		System.out.println("평균: " + s.getAverage());

	}

}
