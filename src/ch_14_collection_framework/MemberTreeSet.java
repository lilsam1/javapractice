package ch_14_collection_framework;

import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet {
	private TreeSet<Member> treeSet;	// treeSet ����
	
	public MemberTreeSet(){
		treeSet = new TreeSet<Member>();	// treeSet ����
	}
	
	public void addMember (Member member) {
		treeSet.add(member);	// treeSet�� ȸ�� �߰�
	}
	
	public boolean removeMember(int memberID) {	// treeSet���� ȸ�� ����
		Iterator<Member> ir = treeSet.iterator();	//iterator�� Ȱ���� ��ȸ
		
		while(ir.hasNext()) {
			Member member = ir.next();	// ȸ���� �ϳ��� ������
			int tempId = member.getMemberID();	// ���̵� ��
			if(tempId == memberID) {	// ���� ���̵��� ���
				treeSet.remove(member);	// ȸ�� ����
				return true;
			}
		}
		System.out.println(memberID + "�� �������� �ʽ��ϴ�");
		return false;
	}
	
	public void showAllMember() {	// ��� ȸ�� ���
		for(Member member : treeSet) {
			System.out.println(member);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
