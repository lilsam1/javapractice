package ch_08_inheritance;

/*
 점수를 입력받는 생성자를 만들고
 모든 과목의 점수를 볼 수 있는 display() 생성
 */

class Score {
	private int kor;
	private int math;
	private int eng;
	private int com;

//	public int getKor() {
//		return kor;
//	}
//
//	public void setKor(int kor) {
//		this.kor = kor;
//		if(kor >= 0 && kor <= 100) {
//			this.kor = kor;
//		}
//		else {
//			System.out.println(kor + "는 올바른 값이 아닙니다");
//		}
//	}

	public Score(int kor, int math, int eng, int com) {
		this.kor = kor;
		this.math = math;
		this.eng = eng;
		this.com = com;
	}
	
	public void display(){
		System.out.println("국어 점수 : " + kor);
		System.out.println("수학 점수 : " + math);
		System.out.println("영어 점수 : " + eng);
		System.out.println("컴퓨터 점수 : " + com);
	}
	
}

public class Ex_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Score score = new Score(100, 80, 95, 84);
		score.display();	// OK: 외부에서 접근 가능

	}

}
