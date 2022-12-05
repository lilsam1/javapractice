package ch_09_abstract;

import java.util.ArrayList;

abstract class Car {
	protected String name;
	
	Car(String name) {
		this.name = name;
	}
	

	public abstract void turnoff();

	public abstract void stop();

	public abstract void drive();

	public abstract void start();
	
	public void run() {
 		start();
 		drive();
 		stop();
 		turnoff();
	}

}

class Sonata extends Car {
	Sonata() {
		super("Sonata");
	}	
	public void start()  {
		System.out.println(name + " �õ��� �մϴ�");
	}
	public void drive()  {
		System.out.println(name + " �޸��ϴ�");
	}
	public void stop()  {
		System.out.println(name + " ����ϴ�");
	}
	public void turnoff()  {
		System.out.println(name + " �õ��� ���ϴ�");
	}
	
}

class Grandeur extends Car {
	Grandeur() {
		super("Grandeur");
	}
	
	public void start()  {
		System.out.println(name + " �õ��� �մϴ�");
	}
	public void drive()  {
		System.out.println(name + " �޸��ϴ�");
	}
	public void stop()  {
		System.out.println(name + " ����ϴ�");
	}
	public void turnoff()  {
		System.out.println(name + " �õ��� ���ϴ�");
	}
}

class Avante extends Car {
	Avante() {
		super("Avante");
	}
	
	public void start()  {
		System.out.println(name + " �õ��� �մϴ�");
	}
	public void drive()  {
		System.out.println(name + " �޸��ϴ�");
	}
	public void stop()  {
		System.out.println(name + " ����ϴ�");
	}
	public void turnoff()  {
		System.out.println(name + " �õ��� ���ϴ�");
	}
}

class Genesis extends Car {
	Genesis() {
		super("Genesis");
	}
	
	public void start()  {
		System.out.println(name + " �õ��� �մϴ�");
	}
	public void drive()  {
		System.out.println(name + " �޸��ϴ�");
	}
	public void stop()  {
		System.out.println(name + " ����ϴ�");
	}
	public void turnoff()  {
		System.out.println(name + " �õ��� ���ϴ�");
	}
}

/*
 Car �߻� Ŭ������ ��ӹ޴� Sonata, Grandeur, Avante, Genesis Ŭ������ �ֽ��ϴ�
 ������ �����ϱ� ���� ���� ������ �����Դϴ�
 
 	run() {
 		start();
 		drive();
 		stop();
 		turnoff();
 	}
 
 CarTest Ŭ������  ���� ���� ��� ����� ��������
 Car, Sonata, Grandeur, Avante, Genesis Ŭ������ �����ϼ���
 
 ��� ��� :
 Sonata �õ��� �մϴ�
 Sonata �޸��ϴ�
 Sonata ����ϴ�
 Sonata �õ��� ���ϴ�
 ============================
 Grandeur �õ��� �մϴ�
 Grandeur �޸��ϴ�
 Grandeur ����ϴ�
 Grandeur �õ��� ���ϴ�
 ============================
 Avante �õ��� �մϴ�
 Avante �޸��ϴ�
 Avante ����ϴ�
 Avante �õ��� ���ϴ�
 ============================
 Genesis �õ��� �մϴ�
 Genesis �޸��ϴ�
 Genesis ����ϴ�
 Genesis �õ��� ���ϴ�
 */

public class Abstract_ex04 {

	public static void main(String[] args) {
		// TODO AuArrayList<E>ted method stub
		ArrayList<Car> carList = new ArrayList<Car>();
		
		carList.add(new Sonata());
		carList.add(new Grandeur());
		carList.add(new Avante());
		carList.add(new Genesis());
		
		for(Car car : carList) {
			car.run();
			System.out.println("============================");
		}
	}

}
