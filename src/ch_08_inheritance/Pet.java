package ch_08_inheritance;

public class Pet {
	private String name;		// �ֿϵ��� �̸�
	private String masterName;	// ���� �̸�
	
	public Pet(String name, String masterName) {	// ������
		this.name = name;		// �ֿϵ��� �̸�
		this.masterName = masterName;		// ���� �̸�
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMasterName() {
		return masterName;
	}

	public void setMasterName(String masterName) {
		this.masterName = masterName;
	}
	
	public void introduce() {	// �ڱ�Ұ�
		System.out.println("�� �̸��� " + name + "�Դϴ�");
		System.out.println("���δ��� " + masterName + "�Դϴ�");
	}
	
	
	
	

}
