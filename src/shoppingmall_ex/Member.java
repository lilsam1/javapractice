package shoppingmall_ex;

public class Member {	// ȸ�� ���� �� Ŭ����
	private final String memberID;	// ���̵�
	private String password;	// ��й�ȣ
	private String name;	// �̸�
	private String address;	// �ּ�
	private String email;	// �̸���
	
	Member(String memberID, String password, String name) {	// �����ڸ� ���� �Է�
		this.memberID = memberID;
		this.password = password;
		this.name = name;
	}

	String getPassword() {
		return password;
	}

	
	void setAddress(String address) {
		this.address = address;
	}

	void setEmail(String email) {
		this.email = email;
	}

	String getMemberID() {
		return memberID;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		System.out.println("ȸ������������ �Ʒ��� �����ϴ�");
		return "���̵� : " + memberID + ", �̸� : " + name + ", �ּ� " + address + ", �̸��� : " + email;
	}
	
	
	
}
