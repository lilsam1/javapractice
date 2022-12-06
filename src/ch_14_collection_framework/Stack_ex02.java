package ch_14_collection_framework;

import java.util.Stack;

// Stack�� �̿��� �������̽�
class Coin {	// ���� ���̽��� ������ Ŭ����
	private int value;
	
	public Coin(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
}

public class Stack_ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Coin> coinBox = new Stack<Coin>();
		
		// ������ ����
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		
		while (!coinBox.isEmpty()) {	// ���� ���̽��� ������� Ȯ��
			Coin coin = coinBox.pop();	// ���� ���̽����� ���� ���� ������ ����
			System.out.println("������ ���� : " + coin.getValue() + "��");
		}
		/*
		 ������ ���� : 10��
		 ������ ���� : 500��
		 ������ ���� : 50��
		 ������ ���� : 100��
		 */

	}

}
