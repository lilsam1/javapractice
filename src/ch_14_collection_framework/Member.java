package ch_14_collection_framework;

public class Member implements Comparable<Member> {
	private int memberID;	// ȸ�� ���̵�
	private String memberName;	// ȸ�� �̸�
	
	public Member(int memberID, String memberName) {
		this.memberID = memberID;
		this.memberName = memberName;
	}

	public int getMemberID() {
		return memberID;
	}

	public void setMemberID(int memberID) {
		this.memberID = memberID;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return memberName + " ȸ������ ���̵�� " + memberID + "�Դϴ�";
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return memberID;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if( obj instanceof Member) {
			Member member = (Member)obj;
			if(this.memberID == member.memberID)
				return true;
			else
				return false;
		}
		return false;
	}

	@Override
	public int compareTo(Member member) {
		// TODO Auto-generated method stub
		// ���ϴ� �� �� �� this ���� �� ũ�� ����� ��ȯ�Ͽ� ������������ ����
		// �޼��带 ȣ���ϴ� ��ü�� ���ڷ� �Ѿ�� ��ü���� ���� ��� ������ �����ϰ�, ũ�Ⱑ �����ϴٸ� 0, Ŭ ��쿡�� ����� ����
//		return (this.memberID - member.memberID)	// memberID�� �����̱� ������ ������������ ����
		return (this.memberID - member.memberID) * (-1);	// ������������ �����ϱ� ���� ��ȯ���� ������ ����
	}
	
	
}