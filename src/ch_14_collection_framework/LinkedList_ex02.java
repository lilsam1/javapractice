package ch_14_collection_framework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedList_ex02 {
/* ArrayList와 LinkedList의 실행 성능 비교
 끝에서부터(순차적으로) 추가 도는 삭제하는 경우 ArrayList가 빠르지만
 중간에 추가, 삭제하는 경우에는 앞 뒤 링크 정보만 변경하는 LinkedList가 더 빠름
 ArrayList는 뒤쪽 인덱스를 모두 1씩 증가 또는 감소 시키는 시간이 필요하므로 처리 속도가 느림
 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		
		long startTime;
		long endTime;
		
		// 1. 중간에 추가하는 경우
		System.out.println("1. 중간에 추가하는 경우");
		startTime = System.nanoTime();
		for(int i = 0; i < 10000; i++) {
			list1.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList 걸린 시간: " +(endTime - startTime) + " ns");	// ArrayList 걸린시간: 4804200 ns 
		
		startTime = System.nanoTime();
		for(int i = 0; i < 10000; i++) {
			list2.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList 걸린 시간: " + (endTime - startTime) + " ns");	// LinkedList 걸린 시간: 1270500 ns
		
		// 2. 끝에 순차적으로 추가하는 경우
		System.out.println("2. 끝에 순차적으로 추가하는 경우");
		startTime = System.nanoTime();
		for(int i = 0; i < 10000; i++) {
			list1.add(String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList 걸린 시간: " +(endTime - startTime) + " ns");	// ArrayList 걸린 시간: 654900 ns
		
		startTime = System.nanoTime();
		for(int i = 0; i < 10000; i++) {
			list2.add(String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList 걸린 시간: " + (endTime - startTime) + " ns");	// LinkedList 걸린 시간: 738300 ns
	}

}
