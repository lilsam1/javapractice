package ch_14_collection_framework;

import java.util.LinkedList;

public class MemberLinkedList {
	private LinkedList<Member> linkedList;	
	
	public MemberLinkedList() {
		linkedList = new LinkedList<Member>();
	}
	
	public void addMember (Member member) {
		linkedList.add(member);	// ȸ���� �߰�
	}
	
	// for ��
//	public boolean removeMember(int memberID) {
//		for(int i = 0; i < linkedList.size(); i++) {
//			Member member = linkedList.get(i);	// get() �޼���� ȸ���� ���������� ������
//			if(member.getMemberID() == memberID) {	// ȸ�� ���̵�� �Ű������� ��ġ�ϸ�
//				linkedList.remove(i);	// �ش� ȸ���� ����
//				return true;
//			}
//		}
//		System.out.println(memberID + "�� �������� �ʽ��ϴ�");	// �ݺ����� ������ �ش� ���̵� ã�� ���� ���
//		return false;
//	}
	
	// foreach ��
	public boolean removeMember(int memberID) {
	for (Member member : linkedList) {
		if(member.getMemberID() == memberID) {	// ȸ�� ���̵�� �Ű� ������ ��ġ�ϸ�
			linkedList.remove(member);	// �ش� ȸ���� ����
			return true;
			}
		}
		System.out.println(memberID + "�� �������� �ʽ��ϴ�");	// �ݺ����� ������ �ش� ���̵� ã�� ���� ���
		return false;
	}
	
	public void showAllMember() {	// ��ü ȸ���� ����ϴ� �޼���
		for (Member member : linkedList) {
			System.out.println(member);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
