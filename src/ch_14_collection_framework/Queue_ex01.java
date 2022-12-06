package ch_14_collection_framework;

import java.util.LinkedList;

class MyQueue {
	private LinkedList<String> linkedList = new LinkedList<String>();
	
	public void enQueue(String date) {
		linkedList.add(date);	// ť�� �� �ڿ� �߰�
	}
	
	public String dqQueen() {
		// ť�� �� �տ��� ����
		int len = linkedList.size();
		if (len == 0) {
			System.out.println("ť�� ������ϴ�");
			return null;
		}
		return (linkedList.remove(0));	// �� ���� �ڷ� ��ȯ�ϰ� �迭���� ����
	}
}

public class Queue_ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyQueue queue = new MyQueue();
		queue.enQueue("A");
		queue.enQueue("B");
		queue.enQueue("C");
		
		System.out.println(queue.dqQueen());	// A
		System.out.println(queue.dqQueen());	// B
		System.out.println(queue.dqQueen());	// C

	}

}
