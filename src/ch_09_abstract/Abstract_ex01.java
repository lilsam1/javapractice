package ch_09_abstract;

/*
 �߻� �޼���� ����θ� �����ϰ� ��ü���� ������ ������� �޼���
 ��ü���� ������ ���� �ʾұ� ������ �̸� ��ӹ��� ���� Ŭ���������� ����Ϸ��� �ݵ�� �����϶�� �ǹ�
 �߻� �޼��带 �����ϴ� ����� '�߻�����'�̶�� ���� ������, abstract�� �޼���� �տ� �ٿ� ��
 
 �߻� Ŭ������ �߻� �޼��带 ����� ������ Ŭ����
 �߻� Ŭ������ �Ϲ����� �޼��嵵 ���� �� ������ �߻� �޼��带 �ϳ��� �ϳ��� �����ϴ� Ŭ����
 */

abstract class Pokemon { // ���ϸ� �߻� �޼���
	String name;
	
	abstract void attack();		// ���� �߻� �޼���. ��ü���� ������ �����Ƿ� ��ȣ{}�� �����ϰ� ���H�ѷ� ; �� �ٿ���
	abstract void sound();		// �Ҹ� �߻� �޼���
	
	public String getName() {	// ���ϸ��� �̸��� �����ϴ� �޼���
		return this.name;
	}
}

class Pikachu extends Pokemon {	// ��ī�� Ŭ����
	Pikachu() {	// �̸��� �����ϴ� ������
		this.name = "��ī��";
	}
	
	@Override
	void attack() {	// ��ü������ ����
		System.out.println("���� ����");
	}

	@Override
	void sound() {
		System.out.println("��ī��ī");
	}
}

class Squirtle extends Pokemon {	// ��ī�� Ŭ����
	Squirtle() {	// �̸��� �����ϴ� ������
		this.name = "���α�";
	}

	@Override
	void attack() {
		System.out.println("�� ����");
	}

	@Override
	void sound() {
		System.out.println("���� ����");
	}
}

public class Abstract_ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pikachu pikachu1 = new Pikachu();
		System.out.println("�� ���ϸ��� " + pikachu1.getName());
		pikachu1.attack();
		pikachu1.sound();
		
		Squirtle squirtle1 = new Squirtle();
		System.out.println("�� ���ϸ��� " + squirtle1.getName());
		squirtle1.attack();
		squirtle1.sound();

	}

}
