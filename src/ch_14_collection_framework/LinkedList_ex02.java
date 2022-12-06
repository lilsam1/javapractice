package ch_14_collection_framework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedList_ex02 {
/* ArrayList�� LinkedList�� ���� ���� ��
 ����������(����������) �߰� ���� �����ϴ� ��� ArrayList�� ��������
 �߰��� �߰�, �����ϴ� ��쿡�� �� �� ��ũ ������ �����ϴ� LinkedList�� �� ����
 ArrayList�� ���� �ε����� ��� 1�� ���� �Ǵ� ���� ��Ű�� �ð��� �ʿ��ϹǷ� ó�� �ӵ��� ����
 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		
		long startTime;
		long endTime;
		
		// 1. �߰��� �߰��ϴ� ���
		System.out.println("1. �߰��� �߰��ϴ� ���");
		startTime = System.nanoTime();
		for(int i = 0; i < 10000; i++) {
			list1.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList �ɸ� �ð�: " +(endTime - startTime) + " ns");	// ArrayList �ɸ��ð�: 4804200 ns 
		
		startTime = System.nanoTime();
		for(int i = 0; i < 10000; i++) {
			list2.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList �ɸ� �ð�: " + (endTime - startTime) + " ns");	// LinkedList �ɸ� �ð�: 1270500 ns
		
		// 2. ���� ���������� �߰��ϴ� ���
		System.out.println("2. ���� ���������� �߰��ϴ� ���");
		startTime = System.nanoTime();
		for(int i = 0; i < 10000; i++) {
			list1.add(String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList �ɸ� �ð�: " +(endTime - startTime) + " ns");	// ArrayList �ɸ� �ð�: 654900 ns
		
		startTime = System.nanoTime();
		for(int i = 0; i < 10000; i++) {
			list2.add(String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList �ɸ� �ð�: " + (endTime - startTime) + " ns");	// LinkedList �ɸ� �ð�: 738300 ns
	}

}
