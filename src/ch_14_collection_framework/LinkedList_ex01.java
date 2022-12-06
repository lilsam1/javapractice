package ch_14_collection_framework;

import java.util.LinkedList;

public class LinkedList_ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> linkedList = new LinkedList<String>();
		
		// 링크드 리스트에 요소 추가
		linkedList.add("A");
		linkedList.add("B");
		linkedList.add("C");
		
		System.out.println(linkedList);		// 리스트 전체 추렭
		// [A, B, C]
		
		linkedList.add(1, "D");	// 1번 인덱스에 추가
		System.out.println(linkedList);
		//	[A, D, B, C]
		
		linkedList.addFirst("0");	// addFirst() : 맨앞에 추가. LinkedList에서 사용
		System.out.println(linkedList);
		// [0, A, D, B, C]
		
		System.out.println(linkedList.removeLast());	// removeLast(): 맨 뒤의 요소 삭제 및 반환. LinkedList에서 사용
		System.out.println(linkedList);
		// [0, A, D, B]

	}

}
