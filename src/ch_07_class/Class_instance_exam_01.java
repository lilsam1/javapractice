package ch_07_class;

class Cars {
	static int wheel = 4;	// Ŭ���� ����
	int speed;	// �ν��Ͻ� ����
}

public class Class_instance_exam_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		�ν��Ͻ� ������ ������ �ν��Ͻ����� ������ ���� ������ ������ �ֱ� ������ ������ ������ ����
		
		Ŭ���� ������ 
		1) �ϳ��� ���� ������ ��� �ν��Ͻ��� �Բ� �����ϱ� ������
		   �ϳ��� ���������� ���� �����ϴ��� ��� �ν��Ͻ��� ���� ���ϰ� ��
		2) �ν��Ͻ� �������� ���ٰ����ϱ� ������ Ŭ���� �̸����� ������ ��
		 */
		
		System.out.println(Cars.wheel);	// Ŭ���� ���� ���� ����
//		System.out.println(Cars.speed);	// �ν��Ͻ� ���� ���� �Ұ�
		
		Cars myCar1 = new Cars();
		
		System.out.println(Cars.wheel);
		System.out.println(myCar1.speed);	// �ν��Ͻ� ���� �Ŀ��� ���� ����
		
		Cars myCar2 = new Cars();
		
		System.out.println("<���� ��>");
		System.out.println("myCar1.speed: " + myCar1.speed);	// 0
		System.out.println("myCar2.speed: " + myCar2.speed);	// 0
		System.out.println("myCar1.wheel: " + myCar1.wheel);	// 4
		System.out.println("myCar2.wheel: " + myCar1.wheel);	// 4
		
		myCar2.speed = 100;
		myCar2.wheel = 5;
		System.out.println("myCar1.speed: " + myCar1.speed);	// 0
		System.out.println("myCar2.speed: " + myCar2.speed);	// 100
		System.out.println("myCar1.wheel: " + myCar1.wheel);	// 5
		System.out.println("myCar2.wheel: " + myCar1.wheel);	// 5

	}

}
