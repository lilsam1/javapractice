package ch_07_class;

class Card {
	String kind;				// ī�� ���� - �ν��Ͻ� ����
	int number;					// ī�� ���� - �ν��Ͻ� ����
	static int width = 100;		// ī�� �� - Ŭ���� ����
	static int height = 250;	// ī�� ���� - Ŭ���� ����
}

public class Class_instance_exam_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ŭ���� ����(static ����)�� ��ü ���� ���� "Ŭ�����̸�.Ŭ��������"�� ���� ��� ����
		System.out.println("Card.width = " + Card.width);
		System.out.println("Card.height = " + Card.height);
		System.out.println();
		
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;
		
		System.out.println("c1�� " + c1.kind + " " + c1.number + "�̰� ũ��� (" + c1.width + ", " + c1.height + ")");
		System.out.println("c2�� " + c2.kind + " " + c2.number + "�̰� ũ��� (" + c2.width + ", " + c2.height + ")");
		System.out.println();
		
		System.out.println("���� c1�� width�� height�� ���� 50, 80���� �����մϴ�");
		c1.width = 50;
		c1.height = 80;
		
		System.out.println("c1�� " + c1.kind + " " + c1.number + "�̰� ũ��� (" + c1.width + ", " + c1.height + ")");
		System.out.println("c2�� " + c2.kind + " " + c2.number + "�̰� ũ��� (" + c2.width + ", " + c2.height + ")");

	}

}
