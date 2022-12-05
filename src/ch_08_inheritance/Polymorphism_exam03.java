package ch_08_inheritance;

public class Polymorphism_exam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* instanceof ������
		 a instanceof B : a�� B�� ��ü�̴�
		 */
		FireEngine fe = new FireEngine();
		
		if(fe instanceof FireEngine) {	// fe�� FireEngine�� ��ü�̴�
			System.out.println("This is a FireEngine instance");
		}
		if(fe instanceof Car1) {	// fe�� Car1�� ��ü�̴�
			System.out.println("This is a Car1 instance");
		}
		if(fe instanceof Object) {	// fe�� Object�� ��ü�̴�
			System.out.println("This is an Object instance");
		}
		System.out.println();
		
		Car1 polyFe = new FireEngine();	// ������ ����ؼ� ���� ���� ����
		if(polyFe instanceof FireEngine) {	// polyFe�� FireEngine�� ��ü�̴�
			System.out.println("This is a FireEngine instance");
		}
		if(polyFe instanceof Car1 ) {
			System.out.println("This is a Car1 istance");
		}
		if(polyFe instanceof Object) {
			System.out.println("This is an Object istance");
		}
		System.out.println();
		
		Car1 car1 = new Car1();	// �θ� Ŭ������ ��ü ����
		if(car1 instanceof FireEngine) {
			System.out.println("This is a FireEngine instance");
		}
		if(car1 instanceof Car1 ) {	// car1�� Car1�� ��ü�̴�
			System.out.println("This is a Car1 instance");
		}
		if(car1 instanceof Object) {// car1�� object�� ��ü�̴�
			System.out.println("This is an Object instance");
		}
		

	}

}
