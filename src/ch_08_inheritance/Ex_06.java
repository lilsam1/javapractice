package ch_08_inheritance;

/*
 ������ �Է¹޴� �����ڸ� �����
 ��� ������ ������ �� �� �ִ� display() ����
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
//			System.out.println(kor + "�� �ùٸ� ���� �ƴմϴ�");
//		}
//	}

	public Score(int kor, int math, int eng, int com) {
		this.kor = kor;
		this.math = math;
		this.eng = eng;
		this.com = com;
	}
	
	public void display(){
		System.out.println("���� ���� : " + kor);
		System.out.println("���� ���� : " + math);
		System.out.println("���� ���� : " + eng);
		System.out.println("��ǻ�� ���� : " + com);
	}
	
}

public class Ex_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Score score = new Score(100, 80, 95, 84);
		score.display();	// OK: �ܺο��� ���� ����

	}

}
