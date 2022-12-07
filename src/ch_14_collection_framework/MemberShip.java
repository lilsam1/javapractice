package ch_14_collection_framework;

// MemberShip ��ü�� �ߺ� ���� �����ϴ� HashSet
// hashCode()�� equals() �޼��带 ������ ���� ������ ����� ��ü�� 2��

public class MemberShip {
	/* hashCode()�� equals() �޼��� ������ */
	public String name;
	public int age;
	
	public MemberShip(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// hashCode()�� equals() �޼��� ������

	@Override
	public boolean equals(Object obj) {	// name�� age ���� ������ true ����
		// TODO Auto-generated method stub
		// name�� age ���� ������ true ��ȯ
		if (obj instanceof MemberShip) {	// �������� obj�� ������ �����ϰ� �ִ� �ν��Ͻ��� Ÿ���� MemberShip Ŭ���� Ÿ���̸� true�� ��ȯ
			MemberShip memberShip = (MemberShip) obj;
			return memberShip.name.equals(name) && (memberShip.age == age);
		}
		else {
			return false;
		}
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		// name�� age ���� ������ ������ hashcode ��ȯ
		return name.hashCode() + age;	// String�� hashCode() �̿�
	}

	

}
