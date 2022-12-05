package ch_09_abstract;

abstract class Animal {	// ���� Ŭ����
	private String name;	// �̸�
	
	public Animal(String name) {
		this.name = name;
	}
	
	public String getName() { return name;}
	
	public abstract void bark();	// ¢�´�
	public abstract String toString();	// ���ڿ� ǥ���� ��ȯ
	
	public void introduce() {
		System.out.println(toString() + "�Դϴ�");
		bark();
	}
}

class Cat extends Animal {	// ����� Ŭ����
	private int age;	// ����
	
	public Cat(String name, int age) {super(name); this.age = age;}
	
	public void bark() { System.out.println("�߿�");}
	
	public String toString() { return age + "���� " + getName();}
}

class Dog extends Animal {	// �� Ŭ����
	private String type;	// ����
	
	public Dog(String name, String type) {
		super(name); this.type = type;
	}
	
	public void bark() { System.out.println("�۸�");}
	
	public String toString() { return type + "�� " + getName();}
	
}

public class Abstract_ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal[] animals = {
				new Dog("�ٵ���", "��찳"),
				new Cat("�߿���", 7),
				new Dog("���", "������"),
		};
	
		for(Animal animal : animals) {
			animal.introduce();		// animal�� �����ϰ� �ִ� �ν��Ͻ��� ���� ����
			System.out.println();	// �޼��尡 ȣ��ȴ�
		}
	}

}
