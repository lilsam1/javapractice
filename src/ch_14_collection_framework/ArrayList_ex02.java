package ch_14_collection_framework;

import java.util.ArrayList;

/* ArrayLIst : �迭���� ������ ����
 ��Ҹ� �߰��ϸ� 0�� �ε������� ���ʴ�� ����
 �޼��带 ����ؼ� ���ϴ� ��ġ�� ��Ҹ� �߰��ϰų�, ����, ��ȯ �� �� ����
 */

public class ArrayList_ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list1 = new ArrayList(10);	// Ÿ���� �������� ���� ����. �ʱ� capa ���� ������ ���� ����
		list1.add("A");
		list1.add("C");
		list1.add("E");
		list1.add("D");
		
		System.out.print("�ʱ����: ");
		System.out.println(list1);	// [A, C, D, E]
		
		System.out.print("�ε��� 1 ��ġ�� B �߰� :");
		list1.add(1, "B");	// �ε��� ��ȣ�� �����ϰ� �߰��ϴ� ����
		System.out.println(list1);	// [A, B, C, E, D]
		
		System.out.print("�ε��� 2 ��ġ�� �� ���� :");
		list1.remove(2);	// �ε��� ��ȣ�� �̿��Ͽ� ����
		System.out.println(list1);	// [A, B, E, D]
		
		System.out.println("�ε��� 2�� ��ġ�� �� ��ȯ: " + list1.get(2));	// E

	}

}
