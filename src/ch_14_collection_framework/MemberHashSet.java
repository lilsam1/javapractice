package ch_14_collection_framework;

import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {
	private HashSet<Member> hashSet;	// HashSet ����
	
	public MemberHashSet(){
		hashSet = new HashSet<Member>();	// HashSet�� ����
	}
	
	public void addMember (Member member) {
		hashSet.add(member);	// HashSet�� ȸ�� �߰�
	}
	
	public boolean removeMember(int memberID) {
		// �Ű������� ���� ȸ�� ���̵� �ش��ϴ� ȸ�� ����
		Iterator<Member> ir = hashSet.iterator();	//iterator�� Ȱ���� ��ȸ
		
		while(ir.hasNext()) {
			Member member = ir.next();	// ȸ���� �ϳ��� ������
			int tempId = member.getMemberID();	// ���̵� ��
			if(tempId == memberID) {	// ���� ���̵��� ���
				hashSet.remove(member);	// ȸ�� ����
				return true;
			}
		}
		System.out.println(memberID + "�� �������� �ʽ��ϴ�");
		return false;
	}
	
	public void showAllMember() {	// ��� ȸ�� ���
		for(Member member : hashSet) {
			System.out.println(member);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
