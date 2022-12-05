package ch_07_class;

public class Ex_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.name = "홍길동";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		
		System.out.println("이름: " + s.name);
		System.out.println("총점: " + s.getTotal());
		System.out.println("평균: " + s.getAverage());
	}
}

	class Student {
		// 위의 클래스를 완성하기
		
		String name;	// 이름
		int ban;		// 반
		int no;			// 번호
		int kor;		// 국어 성적
		int eng;		// 영어 성적
		int math;		// 수학 성적
		
		int getTotal() {
			return kor + eng + math;
		}
		float getAverage() {
			return (float)this.getTotal() / 3;
		}
}
	
