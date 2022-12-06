package ch_14_collection_framework;

import java.util.ArrayList;

class MyStack {
	private ArrayList<String> arrayStack = new ArrayList<String>();
	
	public void push(String data) {	// ������ �� �ڿ� ��Ҹ� �߰�
		arrayStack.add(data);
	}
	
	public String pop() {
		int len = arrayStack.size();	// ����� ����
		if (len == 0) {
			System.out.println("������ ������ϴ�");
			return null;
		}
		return (arrayStack.remove(len - 1));	// �� �ڿ� �ִ� �ڷ� ��ȯ�ϰ� �迭���� ����
	}
	
	// push(E item) : �־��� ��ü�� ���ÿ� ����
	// peek() : ������ �� �� ��ü�� ������. ��ü�� ���ÿ��� �������� ����
	// pop() : ������ �� �� ��ü�� ������. ��ü�� ���ÿ��� ����
	// peek() ����
	public String peek() {
		int len = arrayStack.size();	// ����� ����
		if (len == 0) {
			System.out.println("������ ������ϴ�");
			return null;
		}
		return (arrayStack.get(len - 1));	// �� �ڿ� �ִ� �ڷ� ��ȯ
	}
	
}

public class Stack_ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStack stack = new MyStack();
		stack.push("A");
		stack.push("B");
		stack.push("C");
		
		System.out.println(stack.peek());	// C
		System.out.println(stack.peek());	// C
		System.out.println(stack.peek());	// C
		
		System.out.println(stack.pop());	// C
		System.out.println(stack.pop());	// B
		System.out.println(stack.pop());	// A
		System.out.println(stack.pop());	// ������ ������ϴ�

	}

}
