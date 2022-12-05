package ch_07_class;

class Card {
	String kind;				// 카드 무늬 - 인스턴스 변수
	int number;					// 카드 숫자 - 인스턴스 변수
	static int width = 100;		// 카드 폭 - 클래스 변수
	static int height = 250;	// 카드 높이 - 클래스 변수
}

public class Class_instance_exam_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 클래스 변수(static 변수)는 객체 생성 없이 "클래스이름.클래스변수"로 직접 사용 가능
		System.out.println("Card.width = " + Card.width);
		System.out.println("Card.height = " + Card.height);
		System.out.println();
		
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;
		
		System.out.println("c1은 " + c1.kind + " " + c1.number + "이고 크기는 (" + c1.width + ", " + c1.height + ")");
		System.out.println("c2은 " + c2.kind + " " + c2.number + "이고 크기는 (" + c2.width + ", " + c2.height + ")");
		System.out.println();
		
		System.out.println("이제 c1의 width와 height를 각각 50, 80으로 변경합니다");
		c1.width = 50;
		c1.height = 80;
		
		System.out.println("c1은 " + c1.kind + " " + c1.number + "이고 크기는 (" + c1.width + ", " + c1.height + ")");
		System.out.println("c2은 " + c2.kind + " " + c2.number + "이고 크기는 (" + c2.width + ", " + c2.height + ")");

	}

}
