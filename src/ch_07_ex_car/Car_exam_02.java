package ch_07_ex_car;

public class Car_exam_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car();
		Car car2 = new Car(car1);	// c1�� ���纻 c2�� ����
		
		System.out.println("c1�� color=" + car1.color + ", gearType=" + car1.gearType + ", door=" + car1.door);
		// c1�� color=white, gearType=auto, door=4
		System.out.println("c2�� color=" + car2.color + ", gearType=" + car2.gearType + ", door=" + car2.door);
		// c2�� color=white, gearType=auto, door=4
		System.out.println();
		
		car1.door = 100;	// c1�� �ν��Ͻ� ���� door�� ���� ����
		System.out.println("c1.door=100; ���� ��");
		System.out.println("c1�� color=" + car1.color + ", gearType=" + car1.gearType + ", door=" + car1.door);
		// c1�� color=white, gearType=auto, door=100
		System.out.println("c2�� color=" + car2.color + ", gearType=" + car2.gearType + ", door=" + car2.door);
		// c2�� color=white, gearType=auto, door=4
		

	}
}
