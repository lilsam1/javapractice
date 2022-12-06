package ch_14_collection_framework;

import java.util.LinkedList;

public class LinkedList_ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> linkedList = new LinkedList<String>();
		
		// ��ũ�� ����Ʈ�� ��� �߰�
		linkedList.add("A");
		linkedList.add("B");
		linkedList.add("C");
		
		System.out.println(linkedList);		// ����Ʈ ��ü �ߎ�
		// [A, B, C]
		
		linkedList.add(1, "D");	// 1�� �ε����� �߰�
		System.out.println(linkedList);
		//	[A, D, B, C]
		
		linkedList.addFirst("0");	// addFirst() : �Ǿտ� �߰�. LinkedList���� ���
		System.out.println(linkedList);
		// [0, A, D, B, C]
		
		System.out.println(linkedList.removeLast());	// removeLast(): �� ���� ��� ���� �� ��ȯ. LinkedList���� ���
		System.out.println(linkedList);
		// [0, A, D, B]

	}

}
