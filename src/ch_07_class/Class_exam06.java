package ch_07_class;

public class Class_exam06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		System.out.println("t1�� channel���� " + t1.channel + "�Դϴ�");	// 0 
		System.out.println("t2�� channel���� " + t2.channel + "�Դϴ�");	// 0
		
		t1.channel = 7;	// channel ���� 7�� �Ѵ�
		System.out.println("t1�� channel���� 7�� �����Ͽ����ϴ�");
		
		System.out.println("t1�� channel���� " + t1.channel + "�Դϴ�");	// 7
		System.out.println("t2�� channel���� " + t2.channel + "�Դϴ�");	// 0

	}

}
