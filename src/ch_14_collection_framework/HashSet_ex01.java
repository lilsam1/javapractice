package ch_14_collection_framework;

import java.util.HashSet;

public class HashSet_ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add(new String("임정순"));
		hashSet.add(new String("박현정"));
		hashSet.add(new String("홍연의"));
		hashSet.add(new String("강감찬"));
		hashSet.add(new String("강감찬"));
		
		// 중복된 문자열은 제거되고 출력 순서와 입력 순서는 상관없음
		System.out.println(hashSet);

	}

}
