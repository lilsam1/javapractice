package ch_08_inheritance;

public class RobotPet extends Pet {
	public RobotPet(String name, String masterName) {	// ������
		super(name, masterName);	// ���� Ŭ������ ������
	}
	
	public void introdue() {	// �ڱ� �Ұ�
		System.out.println("���� �κ��Դϴ�. �̸���" + getName() + "�Դϴ�");
		System.out.println("���δ��� " + getMasterName() + "�Դϴ�");
	}
	
	public void work(int sw) {	// ���� ���� �Ѵ�
		switch (sw) {
		case 0:
			System.out.println("û�Ҹ� �մϴ�");
			break;
		case 1:
			System.out.println("������ �մϴ�");
			break;
		case 2:
			System.out.println("���� �����ϴ�");
			break;
		}
	}
}
