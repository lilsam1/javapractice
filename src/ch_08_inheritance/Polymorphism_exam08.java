package ch_08_inheritance;

class Aniaml {
	void breath() {
		System.out.println("������");
	}
}

class Lion extends Animal {
	@Override
	public String toString() {
		return "����";
	}
}

class Rabbit extends Animal {
	public String toString() {	// ���� Ŭ������ ����� �䳢 Ŭ����
		return "�䳢";
	}
}

class Monkey extends Animal {
	public String toString() {	// ���� Ŭ������ ����� ������ Ŭ����
		return "������";
	}
}

class Zookeeper {	// ������ Ŭ����
	void feed(Animal animal) {	//���� �ִ� �޼���
		System.out.println(animal + "���� ���� �ֱ�");
	}

//	����
//	void feed(Lion lion) {	// ���ڿ��� ���� �ִ� �޼���
//		System.out.println(lion + "���� ���� �ֱ�");
//	}
//	void feed(Rabbit rabbit) {// �䳢���� ���� �ִ� �޼���
//		System.out.println(rabbit + "���� ���� �ֱ�");
//	}
//	void feed(Monkey monkey) {	// ���ڿ��� ���� �ִ� �޼���
//		System.out.println(monkey + "���� ���� �ֱ�");
//	}
	
}

public class Polymorphism_exam08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal lion = new Lion();	// Lion �ν��Ͻ� ����
		Zookeeper james = new Zookeeper();	// james��� �̸��� ������ �ν��Ͻ� ����
		james.feed(lion);	// james�� lion���� ���̸� ��
		
		Animal rabbit = new Rabbit();
		james.feed(rabbit);;
		
		Animal monkey = new Monkey();
		james.feed(monkey);

	}

}
